    package com.stringbuffer.compare;

    public class Compare {
        public static void main(String[] args) {
            //ttaking string for concatenation
            String concatenation = " Perform";
            long starttime,endtime;
            StringBuffer stringBuffer = new StringBuffer("");
            //taking current time
            starttime = System.nanoTime();
            //appending the stringBuffer in the concatenation
            for(int i = 0;i<100000;i++){
                stringBuffer.append(concatenation+" ");
            }
            endtime = System.nanoTime();
            //print time taken by String buffer
            System.out.println("Time taken by String buffer: "+(endtime-starttime));

            StringBuilder stringBuilder = new StringBuilder("");
            starttime = System.nanoTime();
            //appending the stringBuild in the concatenation
            for(int i = 0;i<100000;i++){
                stringBuilder.append(concatenation+" ");
            }
            endtime = System.nanoTime();
            System.out.println("Time taken by String builder: "+(endtime-starttime));

        }
    }
