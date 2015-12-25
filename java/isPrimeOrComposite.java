public class isPrimeOrComposite{
  public static void main(String[] args){
    String inputData[]=args;

    if(inputData.length<1){
      System.out.println("Please provide number as parameter");
      return ;
    }

    for(int i=0; i<inputData.length; i++){
      int testData=0;
      int divideTill=0;
      try{
      testData = Integer.parseInt(inputData[i]);
      divideTill=testData/2;
      }catch(NumberFormatException e){
        System.out.println(inputData[i]+ ": is Invalid Number");
        continue;
      }
      if(testData==0 || testData==1){
        System.out.println(testData+ ": is neither Prime nor Composite Number");
        continue;
      }
      if(testData==2 || testData==3){
        System.out.println(testData+ ": is  Prime Number");
        continue;
      }

      for( int j=2; j<=divideTill; j++ ){
          if( testData%j == 0 ){
            System.out.println(testData+ ": is Composite Number");
            break;
          }
          if( j==divideTill ){
            System.out.println(testData+ ": is Prime Number");
            break;
          }
      }

    }

  }
}
