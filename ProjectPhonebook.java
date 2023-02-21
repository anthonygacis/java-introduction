package practice;
import java.util.Scanner;
public class Practice {
	public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("MAIN MENU:");
            System.out.println("1 - Add phonebook entry");
            System.out.println("2 - Delete phonebook entry");
            System.out.println("3 - View all entries");
            System.out.println("\ta - alphabetical order");
            System.out.println("\tb - increasing order of telephone numbers");
            System.out.println("4 - Search entries");
            System.out.println("\ta - by name");
            System.out.println("\tb - by telephone number");
            System.out.println("5 – Quit");
            System.out.print("Input: ");
            String choice = input.next();
            String names[] = {"","","","",""};
            String numbers[] = {"","","","",""};
            int lastIndex = 0;
            while(!choice.equals("5")) {
                if(choice.equals("1")) {
                    // add
                    Scanner inputRecord = new Scanner(System.in);
                    System.out.println("Add phonebook entry");
                    System.out.print("Enter name: ");
                    String name = inputRecord.nextLine();
                    System.out.print("Enter mobile number: ");
                    String mobileNumber = inputRecord.nextLine();
                    names[lastIndex] = name;
                    numbers[lastIndex] = mobileNumber;
                    System.out.println("Success!");
                    lastIndex++;
                } else if(choice.equals("2")) {
                    // delete
                    for(int element = 0;element < names.length; element++) {
                        if(!names[element].equals("")) {
                            System.out.println(element + " - " + names[element] + ": " + numbers[element]);
                        }
                    }
                    System.out.print("Sub Input for menu 2: ");
                    int deleteIndex = input.nextInt();
                    names[deleteIndex] = "";
                    numbers[deleteIndex] = "";
                    System.out.println("Success!");
                } else if(choice.equals("3")) {
                    System.out.print("Sub Input for menu 3: ");
                    choice = input.next();
                    if(choice.equals("a") || choice.equals("A")) {
                        // alphabetical
                        for(int o = 0;o < names.length; o++) {
                            for(int i = o + 1;i<names.length; i++) {
                                if(!names[o].equals("") && !names[i].equals("")) {
                                    if(names[o].charAt(0) > names[i].charAt(0)) {
                                        String tempName = names[i];
                                        names[i] = names[o];
                                        names[o] = tempName;
                                        
                                        String tempMobile = numbers[i];
                                        numbers[i] = numbers[o];
                                        numbers[o] = tempMobile;
                                    }
                                }
                            }
                        }
                        
                        for(int element = 0;element < names.length; element++) {
                            if(!names[element].equals("")) {
                                System.out.println(names[element] + ": " + numbers[element]);
                            }
                        }
                    } else if(choice.equals("b") || choice.equals("B")) {
                        // increasing order
                    } else {
                        System.out.println("Invalid character");
                    }
                } else if(choice.equals("4")) {
                    Scanner subInput = new Scanner(System.in);
                    System.out.print("Sub Input for menu 4: ");
                    String c = subInput.nextLine();
                    if(c.equals("a") || c.equals("A")) {
                        System.out.print("Query: ");
                        String query = subInput.nextLine();
                        for(int i=0; i<names.length; i++) {
                             if(names[i].equals(query)){
                                 System.out.println("Number: " + numbers[i]);
                             }
                        }
                    } else if(c.equals("b") || c.equals("B")) {
                        System.out.print("Query: ");
                        String query = subInput.nextLine();
                        for(int i=0; i<numbers.length; i++) {
                             if(numbers[i].equals(query)){
                                 System.out.println("Name: " + names[i]);
                             }
                        }
                    }else {
                        System.out.println("Invalid character");
                    }
                }
                
                System.out.print("Input: ");
                choice = input.next();
            }
	}

}

