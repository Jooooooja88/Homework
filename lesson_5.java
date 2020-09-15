package ru.geekbrains.skryabinegor.lesson5;

public class Main {
    public static void main(String[] args) {
        Workers[] workers = new Workers[5];
        workers[0] = new Workers("Petrov A.L.", "manager", "petrov.83@email.com", "123456789", 45000, 37);

        workers[1] = new Workers("Simonov P.T.", "Ingener", "simonov_petya@email.com", "987654321", 50000, 54);

        workers[2] = new Workers("Naumov M.D.", "director", "naumov.shef@email.com", "968574123", 120000, 35);

        workers[3] = new Workers("Plyushkin H.P.", "accountant", "plyuhi-vatruhi@email.com", "142536987", 60000, 47);

        workers[4] = new Workers("Chapolinova O.M.", "cleaner", "iloveplyushkina@email.com", "741258963", 20000, 20);


        for (int i = 0; i < workers.length; i++) {
           if (workers[i].getAge() > 40) {
                workers[i].printWorker();

            }
        }

    }
}


