import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalcTest {

    /**
     * 测试一万天后的日期
     * @param args
     * @throws Exception
     */
    public static void main(String[] args)throws Exception {

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date = df.parse("1993-09-05");

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE,10000);
        Date time = calendar.getTime();

        String format = df.format(time);

        System.out.println(format);
    }

}
