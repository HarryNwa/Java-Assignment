public class AirCondition{

	private boolean isOn;
	private String productName;
	private int temperature;
	
	public AirCondition(String productName){
	    this.productName = productName;
	    }
	public void decreaseTemperature(int decreaseTemperature){
	    this.temperature = decreaseTemperature;
	    }
	    
	public String getProductname(){
	    return productName;
	    }
	public int getTemperature(){
	    return temperature;
	}
	public void increaseTemperature(int increaseTemperature){
	    this.temperature = increaseTemperature;
	}
	public boolean isOn(){
	    return isOn;
	}
	public void setOn(boolean setOn){
	    this.isOn = setOn;
	}
	public void setProductName(String productName){
	    this.productName = productName;
	}
	public void setTemperature(int temperature){
	    this.temperature = temperature;
	}
	    

}
