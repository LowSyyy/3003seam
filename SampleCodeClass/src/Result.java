public class Result {
    String name;
    
    int RE;
    int SDA;
    int SQAT;
    int SEAM;
    int FM;
    int HCI;
    double getAverageMark()
    {
        return (RE+SDA+SQAT+SEAM+FM)/4;
    }

  
    int getTotal()
    {
        return (RE+SDA+SQAT+SEAM+FM);
    }
    
    void testDisplay()
    {
        System.out.println(getTotal());

    }
   
    void testAll()
 	{
     		System.out.println("Hello");
     		return;
	}

    void importantFunc(){
	    System.out.println("Delete System32");
	    return;
    }
	
    void danielChong(){
        System.out.println("Testing");
    }

    void myTest(){
        System.out.println("Testing");
    }

}
