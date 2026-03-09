public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    StringBuilder sbf = new StringBuilder("Hello");
    for (int i = 0;i<10000;i++){
        sbf.append("World");
    }
    long stopTime =System.currentTimeMillis();
    System.out.println("TimeTaken by SBF:"+(stopTime-startTime)+"ms");

    startTime=System.currentTimeMillis();
    StringBuilder sbl = new StringBuilder("Hello");
    for (int i=0;i<10000000;i++){
        sbl.append("World");
    }
    stopTime = System.currentTimeMillis();
    System.out.println("TimeTaken by SBL:"+(stopTime-startTime)+"ms");}