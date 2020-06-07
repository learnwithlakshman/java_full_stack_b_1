package com.nubes.cj.cbook;

import java.util.List;
import java.util.Scanner;

import com.nubes.cj.cbook.domain.Address;
import com.nubes.cj.cbook.domain.Contact;
import com.nubes.cj.cbook.exceptions.ContactExistsException;
import com.nubes.cj.cbook.service.ContactService;
import com.nubes.cj.cbook.service.ContactServiceImpl;

public class Driver {
	public static void main(String[] args) {
		ContactService contactService = ContactServiceImpl.getInstance();
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("------------------------- Contact Book Application-----------------------------");
			System.out.println("1.add 2.delete 3.update 4.search 5.view all 6.exit ");
			int ch = sc.nextInt();
		
			switch (ch) {
			case 1:
				Contact contact = getContactDetailsFromUser();
				try {
					Contact newContact = contactService.addContact(contact);
					System.out.println("Contact is added with id:"+newContact.getId());
				} catch (ContactExistsException e) {
					System.out.println("While adding contact :"+e);
				}
				break;
			case 5:
				List<Contact> list = contactService.getAllContacts();
				showContactDetails(list);
				break;

			default:
				System.out.println("Enter valid choice...(1-6) only");
			}
		}
	}

	private static void showContactDetails(List<Contact> list) {
		if(list!=null && list.size() > 0) {
			list.stream().forEach(c->{
				System.out.println("Full name:"+(c.getFirstName()+" "+c.getLastName()));
				System.out.println("Mobile: "+c.getMobile());
				System.out.println("Email: "+c.getEmail());
				System.out.println("City :"+c.getAddress().getCity());
				System.out.println("State :"+c.getAddress().getState());
				System.out.println("\n--------------------------------------------------------\n");
			});
		}else {
			System.out.println("Contact list is empty.... Please add");
		}
		
	}

	private static Contact getContactDetailsFromUser() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name:");
		String firstName = sc.nextLine();
		System.out.println("Enter the last name:");
		String lastName = sc.nextLine();
		System.out.println("Enter the email name:");
		String email = sc.nextLine();
		System.out.println("Enter the mobile :");
		String mobile = sc.nextLine();

		System.out.println("Enter the city:");
		String city = sc.nextLine();
		System.out.println("Enter the state:");
		String state = sc.nextLine();

		Address address = Address.builder().city(city).state(state).build();
		Contact contact = Contact.builder().firstName(firstName).lastName(lastName).email(email).mobile(mobile)
				.address(address).build();
		
		return contact;
	}
}
