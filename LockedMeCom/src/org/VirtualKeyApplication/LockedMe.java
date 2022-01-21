package org.VirtualKeyApplication;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class LockedMe 
{
	
	 static String Directory;
	    File folder_name;
	    
	    public LockedMe()
	    {
	        Directory = System.getProperty("user.dir");
	        folder_name = new File(Directory+"/files");
	        
	        if (!folder_name.exists())
	            folder_name.mkdirs();
	        System.out.println("Directory : "+ folder_name.getAbsolutePath());
	    }
	    
	    private static final String Welcome_Prompt =
	    		"\n********** WelCome**********"+
	            "\n********** LockedMe.com **********"+
	            "\n********** "+ "Nagaveni H K"+ " **********\n";
	    
	    private static final String Main_Menu_Prompt =
	            "\n Select any of the following: \n"+
	                    "1. List files in directory\n"+
	                    "2. Add ,Delete or Search files\n"+
	                    "3. Exit Program\n";
	    
	    private static final String SECONDARY_MENU_PROMPT =
	            "   \nSelect any of the following: \n"+
	                    " a. Add a file\n"+
	                    " b. Delete a file\n"+
	                    " c. Search a file\n"+
	                    " d. GoBack\n";
	    
	    void showMenu()
	    {
	        System.out.println(Main_Menu_Prompt);
	        try{
	            Scanner scanner = new Scanner(System.in);
	            int option = scanner.nextInt();
	            switch (option)
	            {
	                case 1 : {
	                    showFiles();
	                    showMenu();
	                }
	                
	                case 2 : {
	                    showMenu2();
	                }
	                
	                case 3: {
	                    System.out.println("Thank You");
	                    System.exit(0);
	                }
	                
	                default: showMenu();
	            }
	        }catch (Exception e){
	            System.out.println("Please enter 1, 2 or 3");
	            showMenu();
	        }
	    }
	    void showMenu2() 
	    {
	        System.out.println(SECONDARY_MENU_PROMPT);
	        
	        try{
	            Scanner scanner = new Scanner(System.in);
	            char[] input = scanner.nextLine().toLowerCase().trim().toCharArray();
	            char option = input[0];

	            switch (option)
	            {
	                case 'a' : {
	                    System.out.println(" Adding a file");
	                    System.out.println(" Please Enter a File Name : ");
	                    String filename = scanner.next().trim().toLowerCase();
	                    addFile(filename);
	                    break;
	                }
	                
	                case 'b' : {
	                    System.out.println(" Deleting a file");
	                    System.out.println(" Please Enter a File Name : ");
	                    String filename = scanner.next().trim();
	                    deleteFile(filename);
	                    break;
	                }
	                
	                case 'c' : {
	                    System.out.println(" Searching a file ");
	                    System.out.println(" Please Enter a File Name : ");
	                    String filename = scanner.next().trim();
	                    searchFile(filename);
	                    break;
	                }
	                
	                case 'd' : {
	                    System.out.println("Going Back to MAIN menu");
	                    showMenu();
	                    break;
	                }
	                
	                default : System.out.println("Please enter a, b, c or d");
	            }
	            showMenu2();
	        }
	        
	        catch (Exception e){
	            System.out.println("Please enter a, b, c or d");
	            showMenu2();
	        }
	    }
	    
	    void showFiles()
	    {
	        if (folder_name.list().length==0)
	            System.out.println("The folder is empty");
	        
	        else
	        {
	            String[] list = folder_name.list();
	            System.out.println("The files in "+ folder_name +" are :");
	            Arrays.sort(list);
	            
	            for (String str:list)
	            {
	                System.out.println(str);
	            }
	        }
	    }
	    
	    void addFile(String filename) throws IOException 
	    {
	        File filepath = new File(folder_name +"/"+filename);
	        String[] list = folder_name.list();
	        
	        for (String file: list)
	        {
	            if (filename.equalsIgnoreCase(file))
	            {
	                System.out.println("File " + filename + " already exists at " + folder_name);
	                return;
	            }
	        }
	        
	        filepath.createNewFile();
	        System.out.println("File "+filename+" added to "+ folder_name);
	    }
	    
	    void deleteFile(String filename)
	    {
	        File filepath = new File(folder_name +"/"+filename);
	        String[] list = folder_name.list();
	        for (String file: list) {
	            if (filename.equals(file) && filepath.delete()) 
	            {
	                System.out.println("File " + filename + " deleted from " + folder_name);
	                return;
	            }
	        }
	        System.out.println("Delete Operation failed. FILE NOT FOUND");
	    }
	    
	    void searchFile(String filename)
	    {
	        String[] list = folder_name.list();
	        for (String file: list) {
	            if (filename.equals(file)) {
	                System.out.println("FOUND : File " + filename + " exists at " + folder_name);
	                return;
	            }
	        }
	        System.out.println("File NOT found");
	    }
	    
	    public static void main(String[] args)
	    {
	        System.out.println(Welcome_Prompt);
	        LockedMe menu = new LockedMe();
	        menu.showMenu();
	    }

}
