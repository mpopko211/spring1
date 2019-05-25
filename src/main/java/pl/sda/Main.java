package pl.sda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("my-beans.xml");

//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        Message message = (Message) context.getBean("message");
        System.out.println(message.getText());
        message.setText("Wybuch");


        Message message1 = (Message) context.getBean("message");
        System.out.println(message1.getText());

        Book book = (Book) context.getBean("book");
        System.out.println(book.getAuthor().getName() + " " + book.getAuthor().getLastName() + " napisał książkę pt: " + book.getTitle());

        Person person= (Person) context.getBean("person");
        System.out.println(person.getAdres().getCity() + " " + person.getAdres().getPostalCode() + " " + person.getAdres().getStreet());
//        ExtraMessage value = (ExtraMessage) context.getBean("value");
//        System.out.println(value.getValue());

    }

}
