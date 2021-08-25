package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




 class Passenger {
	 int seates = 0;
	 ArrayList<String> list = new ArrayList<>();
}

public class RedBusBooking implements Runnable {
	List<String> s = ListofSeates();
	List<Passenger> passengers = new ArrayList<Passenger>();
	
	
	@Override
	public void run() {
		bookTicket();
		display();
	}
	
	private List<String> ListofSeates(){
		List<String> s = new ArrayList<>();
		s.add("A1");
		s.add("A2");
		s.add("B1");
		s.add("B2");
		s.add("C1");
		s.add("C2");
		return s;
	}
	
	int availableSeats=3;	 
	
	public synchronized void bookTicket() {
		
		int Seats;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of tickets to be booked:");
		Seats = sc.nextInt();
		 
		 int numberOfSeats = Seats;
		
		 
	 
		if(s.size() < numberOfSeats || numberOfSeats > 2) {
			System.out.println("You can book max 2 seats");
			return;
		}
		System.out.println("Payment processing...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		Passenger p = new Passenger();
		
		for(int i=0; i<numberOfSeats; i++) {
			String currentSeat = s.get(0);
			s.remove(s.get(0));
			p.list.add(currentSeat);
			p.seates++;
		}
		passengers.add(p);

	}
	
	public void display() {
		for(int i =0 ;i<passengers.size(); i++) {
			Passenger p = passengers.get(i);
			System.out.println("Allocalted Seates are:"+p.list.toString());
		}
		
		System.out.println("Empty seats: "+s.size());
	}
	
	public static void main(String[] args) {
		
		RedBusBooking b1 = new RedBusBooking();
		 
		Thread t1 = new Thread(b1);
		Thread t2 = new Thread(b1);
		
		t1.start();
		t2.start();
		
	}
}
