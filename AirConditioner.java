public class AirConditioner{
	
	private boolean isOn;
	private String productName;
	private int temperature;
	
	public AirConditioner(boolean isOn, int temperature){
	    this.productName = productName;
	    this.isOn = false;
	    this.temperature = 25;
	}

	

	public void decreaseTemperature(){
	     if (isOn && temperature > 16){
	     temperature--;
	     }
	     System.out.println("Temperature decreased to " + temperature);
	}

	public String getProductName(){
	    return productName;
	}
	
	public int getTemperature(){
	    return temperature;
	}
	
	public void increaseTemperature(){
	    if (isOn && temperature < 30){
	    temperature++;
	    }
	    System.out.println("Temperature increased to " + temperature);
	}
	
	public boolean isOn(){
	    return isOn;
	}
	
	public void setOn(){
	    if (!isOn){
	    isOn = true;
	    }
	    System.out.println("The AirConditioner is turned on");
	}
	
	public void turnOff(){
	    if (isOn){
	    isOn = false;
	    }
	    System.out.println("The AirConditioner is turned off");
	}
	
	public void setProductName(String productName){
	    this.productName = productName;
	}
	
	public void setTemperature(int temperature){
	    this.temperature = 25;
	}



	

}
