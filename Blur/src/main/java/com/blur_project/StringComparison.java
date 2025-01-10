package com.blur_project;

//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * Servlet implementation class StringComparison
// */
////@WebServlet("/StringComparison")
//public class StringComparison extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
////    /**
////     * Default constructor. 
////     */
////    public StringComparison() {
////        // TODO Auto-generated constructor stub
////    }
////
////	/**
////	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
////	 */
////	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
////		// TODO Auto-generated method stub
////		response.getWriter().append("Served at: ").append(request.getContextPath());
////	}
////
////	/**
////	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
////	 */
////	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
////		// TODO Auto-generated method stub
////		doGet(request, response);
////	}
//	
//	
//
//}


import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter the number of strings:");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[] strings = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }

       
        for (String str : strings) {
            System.out.println("Analyzing string: " + str);

          
            for (int i = 0; i < str.length(); i++) {
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        System.out.println("Character '" + str.charAt(i) + "' matches at positions " + i + " and " + j);
                    }
                }

                if (str.charAt(i) == str.charAt(str.length() - 1)) {
                    System.out.println("Character '" + str.charAt(i) + "' matches the last character at position " + i);
                }
            }

        
            String reversed = new StringBuilder(str).reverse().toString();
            if (str.equals(reversed)) {
                System.out.println(" string '" + str + "' is a palindrome.");
            } else {
                System.out.println("string '" + str + "' is not a palindrome.");
            }
        }

      
        System.out.println("\nComparing strings with each other:");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (strings[i].equals(strings[j])) {
                    System.out.println("String '" + strings[i] + "' matches with string '" + strings[j] + "'");
                } else {
                    System.out.println("String '" + strings[i] + "' does not match with string '" + strings[j] + "'");
                }
            }
        }

        scanner.close();
    }
}

