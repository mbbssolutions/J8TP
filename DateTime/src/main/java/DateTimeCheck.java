import java.time.*;

/**
 * Created by Pavan_Karasala on 11/4/2016.
 */
public class DateTimeCheck {
    public static void main(String args[]){

        final Clock clock = Clock.systemDefaultZone();
        System.out.println(clock.instant());
        System.out.println(clock.getZone());
        System.out.println(clock.millis());

        final LocalDate localDate=LocalDate.now();
        final LocalDate dateFromClock=LocalDate.now(clock);

        System.out.println(localDate);
        System.out.println(dateFromClock);

        final LocalTime localTime=LocalTime.now();
        final LocalTime timeFromClock = LocalTime.now( clock );

        System.out.println(localTime);
        System.out.println(timeFromClock);

        final LocalDateTime datetime = LocalDateTime.now();
        final LocalDateTime datetimeFromClock = LocalDateTime.now( clock );

        System.out.println( datetime );
        System.out.println( datetimeFromClock );


        final ZonedDateTime zonedDatetime = ZonedDateTime.now();
        final ZonedDateTime zonedDatetimeFromClock = ZonedDateTime.now( clock );
        final ZonedDateTime zonedDatetimeFromZone = ZonedDateTime.now( ZoneId.of( "America/Los_Angeles" ) );

        System.out.println( zonedDatetime );
        System.out.println( zonedDatetimeFromClock );
        System.out.println( zonedDatetimeFromZone );


        final LocalDateTime from = LocalDateTime.of( 2016, Month.APRIL, 16, 0, 0, 0 );
        final LocalDateTime to = LocalDateTime.of( 2016, Month.APRIL, 16, 23, 59, 59 );

        final Duration duration = Duration.between( from, to );
        System.out.println( "Duration in days: " + duration.toDays() );
        System.out.println( "Duration in hours: " + duration.toHours() );
        System.out.println("Duration in hours: " + duration.toMinutes() );

    }
}
