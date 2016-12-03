import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Pavan_Karasala on 10/23/2016.
 */
public class Streams {


    private enum Status{
              OPEN,CLOSED;
    }

    private static final class Task{
        public Integer getPoints() {
            return points;
        }

        public Status getStatus() {
            return status;
        }

        private final Status status;
        private final Integer points;

        private Task(Status status, Integer points) {
            this.status = status;
            this.points = points;
        }

        @Override
        public String toString(){
            return String.format("[%s,%d]",status,points);
        }
    }

    public static void main(String args[]) throws IOException {
        final Collection< Task > tasks = Arrays.asList(
                new Task( Status.OPEN, 5 ),
                new Task( Status.OPEN, 13 ),
                new Task( Status.CLOSED, 8 )
        );

        final long totalPointsOfOpenTasks = tasks
                .stream()
                .filter( task -> task.getStatus() == Status.OPEN)
                .mapToInt( Task::getPoints )
                .sum();

        System.out.println( "Total points: " + totalPointsOfOpenTasks );


        final double totalPoints=tasks
                .stream()
                .parallel()
                .map(task -> task.getPoints())
                .reduce(0,Integer::sum);

        System.out.println("Total points(all tasks):" +totalPoints);

        final Map<Status,List<Task>> map=tasks
                .stream()
                .collect(Collectors.groupingBy(Task::getStatus));

        System.out.println(map);

        final Collection<String> result=tasks
                .stream()
                .mapToInt(Task::getPoints)
                .asLongStream()
                .mapToDouble(points->points/totalPoints)
                .boxed()
                .mapToLong(weight->(long)(weight*100))
                .mapToObj(percentage->percentage+"%")
                .collect(Collectors.toList());

        System.out.println(result);


        ClassLoader classLoader = Streams.class.getClassLoader();
        File file = new File(classLoader.getResource("file/Test").getFile());
        System.out.println(file);
        String fileName= String.valueOf(file);
        final Path path = new File( fileName ).toPath();
        try( Stream< String > lines = Files.lines( path, StandardCharsets.UTF_8 ) ) {
             lines.onClose( () -> System.out.println("Done!") )
                  .forEach( System.out::println );
             }
        }

    }


