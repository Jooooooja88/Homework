package ru.geekbrains.skryabinegor.lesson5;

public class Workers
{
      private String FIO;
      private String position;
      private String email;
      private String telephone;
      private int salary;
      private int age;


      public Workers(String FIO, String position, String email, String telephone, int salary, int age)
      {
          this.FIO = FIO;
          this.position = position;
          this.email = email;
          this.telephone = telephone;
          this.salary = salary;
          this.age = age;
      }



    public void printWorker()
      {
          System.out.println("Ф.И.О " + FIO);
          System.out.println("Должность " + position);
          System.out.println("Почта " + email);
          System.out.println("Телефон " + telephone);
          System.out.println("Зарплата " + salary);
          System.out.println("Возраст " + age);

      }
      public int getAge()
      {
          return age;
      }


}
