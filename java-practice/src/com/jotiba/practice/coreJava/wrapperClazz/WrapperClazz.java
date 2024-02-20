package com.jotiba.practice.coreJava.wrapperClazz;

public class WrapperClazz {
    public static void main(String[] args) {

            // primitive data types
            byte aByte = 'a';
            short shortNo = 325;
            int intNo = 15;
            long longId = 8945497377353898L;
            float floatNo = 8.2f;
            double doubleNo = 17.7854978;
            char character = 'a';
            boolean flag = false;



            // non-primitive(Wrapper) data types
            // auto-boxing
            Byte wrapperByte = aByte;
            Short shortWrapperNo = shortNo;
            Integer integerWrapperNo = intNo;
            Long longWrapperId = longId;
            Float floatWrapperNo = floatNo;
            Double doubleWrapperNo = doubleNo;
            Character wrapperCharacter = character;
            Boolean wrapperFlag = flag;



            System.out.println("Byte wrapperByte :" + wrapperByte +
                               "\nShort shortWrapperNo : " + shortWrapperNo +
                               "\nInteger integerWrapperNo :" + integerWrapperNo +
                               "\nLong longWrapperId :" + longWrapperId +
                               "\nFloat floatWrapperNo :" + floatWrapperNo +
                               "\nDouble doubleWrapperNo :" + doubleWrapperNo +
                               "\nCharacter wrapperCharacter :  " + wrapperCharacter +
                               "\nBoolean wrapperFlag :" + wrapperFlag);
            System.out.println("---------------------------------");

            // unboxing
            int primitiveIntNo = integerWrapperNo;
            System.out.println("int primitiveIntNo :" + primitiveIntNo );
        }
    }

