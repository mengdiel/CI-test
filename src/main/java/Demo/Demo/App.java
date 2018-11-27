package Demo.Demo;


public class App 
{
	private int a;
    public App(){
    }
    
    public App(int a){
    	super();
    	this.a = a;
    }

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
  
    public boolean compare(){
    	return a > 0;
    }
}
