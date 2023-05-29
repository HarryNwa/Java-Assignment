public class AirConditionerTest{

     public static void main(String[] args){
     
     AirConditioner ac = new AirConditioner(true, 25);
     
         ac.setOn();
         ac.increaseTemperature();
         ac.increaseTemperature();
         ac.increaseTemperature();
         ac.increaseTemperature();
         ac.increaseTemperature();
         
         ac.decreaseTemperature();
         //ac.turnOff();
     
     }





}
