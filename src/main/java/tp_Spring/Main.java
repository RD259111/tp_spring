package tp_Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		BeanFactory beans = new ClassPathXmlApplicationContext("springbeans.xml");

		Team t1 = (Team) beans.getBean("team1");
		Team t2 = (Team) beans.getBean("team2");

		System.out.println(t1);
		System.out.println(t2);

		Coach footballCoach = (Coach) beans.getBean("FootballCoach");
		Coach BaseballCoach = (Coach) beans.getBean("BaseballCoach");

		footballCoach.getDailyWorkout();
		BaseballCoach.getDailyWorkout();

	}

}
