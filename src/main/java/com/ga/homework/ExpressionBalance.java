package com.ga.homework;

public class ExpressionBalance {
//    Write a program using the provided Stack class to
//    check whether the pairs and the orders of {, }, (, ), [, ]
//    are correct in an expression string exp.
//    Ensure that every opening bracket has a
//    corresponding and correctly ordered closing bracket.

    public static boolean isBalanced(String exp){
        SingleArrayStack singleArrayStack=new SingleArrayStack(exp.length());
        for (int i=0; i<exp.length(); i++){
            char character= exp.charAt(i); //exp={()} i=0 character="{"

            if (character == '(' || character== '{' || character== '['){
                singleArrayStack.push(character);
            }else if (character== ')' || character== '}' || character== ']'){
                if (singleArrayStack.isEmpty()){
                    return false;
                }
                char opening= singleArrayStack.pop();
                if (character==')' && opening!='('){
                    return false;
                } else if (character=='}' && opening!='{') {
                    return false;
                } else if (character==']' && opening!='['){
                    return false;
                }
            }
        }
        return singleArrayStack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("{}")); //true
        System.out.println(isBalanced("{(")); //false
        System.out.println(isBalanced("{([b])}")); //true
        System.out.println(isBalanced("{{")); //false
    }
}
