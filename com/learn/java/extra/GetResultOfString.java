package com.learn.java.extra;

import java.util.*;

public class GetResultOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name = sc.nextLine();
        System.out.println("Enter age : ");
        short age = sc.nextShort();
        System.out.println("Enter salary : ");
        int salary = sc.nextInt();
        System.out.println("Enter the condition String : ");
        String str =sc.next();
        ArrayList<String> subString = new ArrayList<>();
        int LengthMain = str.length();
        int j = 0;
        int start = 0;
        int lastLast = 0 ;
        
        //Getting Logical AND and OR operators
        ArrayList<String> condiOp = new ArrayList<>();
        for (int i = 0; i < LengthMain - 1; i ++) {
            String s = str.substring(i, i + 2);
            if (s.equals("&&")) {
                condiOp.add("&&");
                lastLast = i+2;
                subString.add(str.substring(start, i));
                start = i + 2;
                j++;
                continue;
            } else if (s.equals("||")) {
                condiOp.add("||");
                lastLast = i+2;
                subString.add(str.substring(start, i));
                start = i + 2;
                j++;
                continue;
            }
            else if(i==LengthMain-2){
                subString.add(str.substring(lastLast));
            }
        }
        System.out.println(subString);
        System.out.println(condiOp);
        
        // splitting with Relational Operators
        ArrayList<String> subCon = new ArrayList<>();
        for (String s : subString) {
            String[] val1 = s.split("==");
            if (val1.length == 2) {
                subCon.add(val1[0]);
                subCon.add("==");
                subCon.add(val1[1]);
                continue;
            }
            val1 = s.split("!=");
            if (val1.length == 2) {
                subCon.add(val1[0]);
                subCon.add("!=");
                subCon.add(val1[1]);
                continue;
            }
            val1 = s.split(">=");
            if (val1.length == 2) {
                subCon.add(val1[0]);
                subCon.add(">=");
                subCon.add(val1[1]);
                continue;
            }
            val1 = s.split("<=");
            if (val1.length == 2) {
                subCon.add(val1[0]);
                subCon.add("<=");
                subCon.add(val1[1]);
                continue;
            }
            val1 = s.split("<");
            if (val1.length == 2) {
                subCon.add(val1[0]);
                subCon.add("<");
                subCon.add(val1[1]);
                continue;
            }
            val1 = s.split(">");
            if (val1.length == 2) {
                subCon.add(val1[0]);
                subCon.add(">");
                subCon.add(val1[1]);
                continue;
            }
        }
        System.out.println(subCon);

        // Calculating the Relational conditions (<, >, <=, >=, ==, !=)
        ArrayList<Boolean> subConVal = new ArrayList<>();
        for (int i = 0; i < subCon.size(); i += 3) {
            if (subCon.get(i).equals("name")) {
                if (subCon.get(i + 1).equals("==")) {
                    if (subCon.get(i + 2).equals(name))
                        subConVal.add(true);
                    else
                        subConVal.add(false);
                    continue;
                } else if (subCon.get(i + 1).equals("!=")) {
                    if (!subCon.get(i + 2).equals(name))
                        subConVal.add(true);
                    else
                        subConVal.add(false);
                    continue;
                }
            } else if (subCon.get(i).equals("age")) {
                int conversionVal = Integer.parseInt(subCon.get(i + 2));
                if (subCon.get(i + 1).equals("==")) {
                    if (conversionVal == age)
                        subConVal.add(true);
                    else
                        subConVal.add(false);
                    continue;
                } else if (subCon.get(i + 1).equals("!=")) {
                    if (conversionVal != age)
                        subConVal.add(true);
                    else
                        subConVal.add(false);
                    continue;
                } else if (subCon.get(i + 1).equals("<=")) {
                    if (age <= conversionVal)
                        subConVal.add(true);
                    else
                        subConVal.add(false);
                    continue;
                } else if (subCon.get(i + 1).equals(">=")) {
                    if (age >= conversionVal)
                        subConVal.add(true);
                    else
                        subConVal.add(false);
                    continue;
                } else if (subCon.get(i + 1).equals(">")) {
                    if (age > conversionVal)
                        subConVal.add(true);
                    else
                        subConVal.add(false);
                    continue;
                } else if (subCon.get(i + 1).equals("<")) {
                    if (age < conversionVal)
                        subConVal.add(true);
                    else
                        subConVal.add(false);
                    continue;
                }
            } else if (subCon.get(i).equals("salary")) {
                int conversionVal = Integer.parseInt(subCon.get(i + 2));
                if (subCon.get(i + 1).equals("==")) {
                    if (conversionVal == salary)
                        subConVal.add(true);
                    else
                        subConVal.add(false);
                    continue;
                } else if (subCon.get(i + 1).equals("!=")) {
                    if (conversionVal != salary)
                        subConVal.add(true);
                    else
                        subConVal.add(false);
                    continue;
                } else if (subCon.get(i + 1).equals("<=")) {
                    if (salary <= conversionVal)
                        subConVal.add(true);
                    else
                        subConVal.add(false);
                    continue;
                } else if (subCon.get(i + 1).equals(">=")) {
                    if (salary >= conversionVal)
                        subConVal.add(true);
                    else
                        subConVal.add(false);
                    continue;
                } else if (subCon.get(i + 1).equals(">")) {
                    if (salary > conversionVal)
                        subConVal.add(true);
                    else
                        subConVal.add(false);
                    continue;
                } else if (subCon.get(i + 1).equals("<")) {
                    if (salary < conversionVal)
                        subConVal.add(true);
                    else
                        subConVal.add(false);
                    continue;
                }
            }
        }
        System.out.println(subConVal);

        // Result for AND (&&)
        for (int i = 0; i < condiOp.size(); i++) {
            if (condiOp.get(i).equals("&&")) {
                condiOp.remove(i);
                if (subConVal.get(i) && subConVal.get(i + 1)) {
                    subConVal.remove(i);
                    subConVal.set(i, true);
                } else {
                    subConVal.remove(i);
                    subConVal.set(i, false);
                }
                i--;
                System.out.println(subConVal);
            }
        }
        // Result for OR (||)
        for (int i = 0; i < condiOp.size(); i++) {
                condiOp.remove(i);
                if (subConVal.get(i) || subConVal.get(i + 1)) {
                    subConVal.remove(i);
                    subConVal.set(i, true);
                } else {
                    subConVal.remove(i);
                    subConVal.set(i, false);
                }
                i--;
                System.out.println(subConVal);
        }
        sc.close();
        System.out.println("END");
        //  case : salary>14||name==t&&age>50||age!=10&&salary<=60&&name!=vav  v   23   213  true
        //  case : salary>14||name==t&&age>50||age!=10&&salary<=60&&name!=vav  vav  10  60   true
    }
}
