import java.util.ArrayList;
import java.util.List;

import com.lyes.elevator.Cabine;
import com.lyes.elevator.FirstSensor;
import com.lyes.elevator.Sensor;
import com.lyes.observers.ConcretObserver;
import com.lyes.observers.Observer;

public class ElevatorTest {

	public static void main(String[] args) {
		
		List<Sensor> sensors = new ArrayList<Sensor>();
		
		Cabine cabine = new Cabine(1);
		
		Sensor firstSensor = new FirstSensor();
		Sensor secondSensor = new FirstSensor();
		Sensor thridSensor = new FirstSensor();
		
		sensors.add(firstSensor);
		sensors.add(secondSensor);
		sensors.add(thridSensor);
		
		Observer obs = new ConcretObserver(sensors);
		
		cabine.move();
		
		

	}

}
