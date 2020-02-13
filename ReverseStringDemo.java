package com.example.javacore_concept_programs;

//String class in java do not have reverse() method ,
// StringBuilder class does have built in reverse() method.
//StringBuilder class do not have toCharArray() method ,
// while String class does have toCharArray() method.

// String class does not have reverse() method .
// So we need to convert the input string to StringBuilder ,
// which is achieved by using the append method of the StringBuilder.
//  After that print out the characters of the reversed string
//  by scanning from the first till the last index.


public class ReverseStringDemo {

    public static void main(String[] args) {
       /* String input = " ";
        System.out.println("Enter String : ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            input = bufferedReader.readLine();
            char[] trial = input.toCharArray();
            for (int i = trial.length - 1; i >= 0; i--) {
                System.out.print(trial[i]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }*/

      /*  String input = "Hello";
        StringBuilder reverseString = new StringBuilder();
        reverseString.append(input);
        reverseString = reverseString.reverse();
        for (int i = 0; i < reverseString.length() ; i++) {
            System.out.print(reverseString.charAt(i));
        }*/

        /*String input = "Google";
        char[] reverseString = input.toCharArray();
        List<Character> trial = new LinkedList<>();
        for (char c : reverseString) {
            trial.add(c);
            Collections.reverse(trial);
            ListIterator listIterator = trial.listIterator();
            while (listIterator.hasNext()) {
                System.out.print(listIterator.next());
            }

        }*/

      /*  String input = "SpringBoard";
        String reversed = reverseString(input);
        System.out.println("Reversed String is : " + reversed);

    }

    public static String reverseString(String input) {
        if (input.isEmpty()) {
            return input;
        }
        return reverseString(input.substring(1)) + input.charAt(0);*/

      String input="SpringBoard";
      byte[] byteArray=input.getBytes();
      byte[]result= new byte[byteArray.length];
      for (int i=0;i<byteArray.length;i++){
          result[i]=byteArray[byteArray.length-i-1];

      }
        System.out.print(new String(result));
    }
}
