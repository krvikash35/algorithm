var inputData=process.argv;

if(inputData.length<3){
  return console.log("Please provide number as parameter");
}

for(var i=2; i<inputData.length;i++){
  var testData=inputData[i]
  var divideTill=parseInt(testData/2)
  if( isNaN( testData ) ){
    console.log(testData+ ": is Invalid Number");
  }else {
    if(testData==0 || testData==1){
      console.log(testData+ ": is neither Prime nor Composite Number");
    }else {
      if(testData==2 || testData==3){
        console.log(testData+ ": is  Prime Number");
      }else {
        for( var j=2; j<=divideTill; j++ ){
          if(testData%j == 0){
            console.log(testData+ ": is Composite Number");
            break;
          }
          if( j==divideTill ){
            console.log(testData+ ": is  Prime Number");
          }
        }
      }
    }
  }
}
