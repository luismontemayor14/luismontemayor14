import java.util.Scanner;
public class AIDetection{
    public static void main (String []args){
        Scanner scnr  = new Scanner(System.in);
        System.out.println("Input a lines of code : ");
        String text = scnr.nextLine().toLowerCase();
         int counter = 0;
         if(beginnerCode(text)){
            counter++;
            System.out.println("Beginner level code detected.");
         }
         if(intermediateCode(text)){
            counter+=2;
            System.out.println("Intermidate level code detected.");
         }
         if(professionalCode(text)){
            counter+=3;
            System.out.println("Professional level code.");
         }
         if(aiGeneratedCode(text)){
            counter+=4;
            System.out.println("AI level code detected.");
         }
         if(counter>=7){
            System.out.println("Text is likely Ai generated");
         }
         else if(counter>=5){
            System.out.println("Text is at a professional level");
        }
        else if (counter>=3){
            System.out.println("Text is at a Intermidiate level");
         }
         else{
            System.out.println("Text is at a beginner level");

         }
         scnr.close();
    }
    public static boolean beginnerCode(String code) {
      String[] beginnerKeywords = { "static","print", "if", "else", "int", "while", "for", "scanner", "system.out.print", 
      "system.out.println", "do", "char", "double", "float", "boolean", "==", "=", 
      "string", "public", "main", "void", "input", "true", "false", "break", "continue", 
      "Math.random", "length", "new", "null", "+"};
      return containsKeywords(code, beginnerKeywords);
  }

  public static boolean intermediateCode(String code) {
      String[] intermediateKeywords = {"try", "catch", "throw", "array", "methods", "return", "HashMap", "ArrayList", 
    "constructor", "switch", "case", "Scanner", "equals", "toString", "substring", 
    "for-each", "split", "parseInt", "indexOf", "charAt", "instanceof"};
      return containsKeywords(code, intermediateKeywords);
  }

  public static boolean professionalCode(String code) {
      String[] professionalKeywords = { "thread", "synchronized", "lambda", "stream", "polymorphism", "abstract", 
      "private", "protected", "interface", "inheritance", "encapsulation", 
      "reflection", "serialization", "immutable", "volatile", "final", 
      "transient", "concurrency", "parallel", "executor", "singleton", "factory", 
      "observer", "asynchronous", "completablefuture", "optional", "generics", 
      "annotations", "dependency", "overloading", "overriding"};
      return containsKeywords(code, professionalKeywords);
  }

  public static boolean aiGeneratedCode(String code) {
      String[] aiKeywords = {
          "neural network", "machine learning", "backpropagation", "gradient descent",
          "deep learning", "transformer", "attention mechanism","processInput", "validateData", "computeResult", "initializeVariables", "handleException", "generateOutput", "optimizePerformance", "findMatchingElements",
           "calculateFactorial", "isPrimeNumber", "sortArray", "mergeDataSets", "filterResults", "transformData", "executeTask", "parallelProcess", "asynchronousCall", "streamData", "dynamicAllocation", 
          "map", "filter", "reduce", "collectors.toList", "optional.ofNullable", "stringBuilder.append", "Arrays.asList", "ExecutorService.submit"

      };
      return containsKeywords(code, aiKeywords);
  }

  public static boolean containsKeywords(String code, String[] keywords) {
      for (int i = 0; i < keywords.length; i++) {
          if (code.contains(keywords[i])) {
              return true;
      }
     
  
}
return false; 
  }
}

