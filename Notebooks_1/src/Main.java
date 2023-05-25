import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("Lenovo", 8, 512, "no OS", "Silver");
        Notebook notebook2 = new Notebook("Apple", 16, 1024, "iOS", "Black");
        Notebook notebook3 = new Notebook("HP", 12, 512, "Windows", "White");
        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);

        try {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.println("Введите бренд: ");
                String br = scanner.nextLine();
                System.out.println("Введите oбъём оперативной памяти: ");
                int maMemUs = Integer.parseInt(scanner.nextLine());
                System.out.println("Введите объём жесткого диска: ");
                int hardD = Integer.parseInt(scanner.nextLine());
                System.out.println("Введите операционную систему: ");
                String osU = scanner.nextLine();
                System.out.println("Введите цвет: ");
                String colUs = scanner.nextLine();
                UserBook userBook = new UserBook(br, maMemUs, hardD, osU, colUs);
                System.out.println("Ваша конфигурация: " + userBook);

                for (Notebook notebook : notebooks) {
                    if (notebook.getBrand().equals(userBook.brandUs())) {
                        if (notebook.getMainMemory() == userBook.mainMemoryUs()) {
                            if (notebook.getHardDisc() == userBook.hardDiscUs()) {
                                if (notebook.getOs().equals(userBook.osUs())) {
                                    if (notebook.getColor().equals(userBook.colorUs())) {
                                        System.out.println("Найдено: " + notebook);
                                        break;
                                    }
                                } else {
                                    System.out.println("Такой конфигурации нет в базе!");
                                }
                            }
                        }
                    }
                }
            } catch (Throwable var15) {
                try {
                    scanner.close();
                } catch (Throwable var14) {
                    var15.addSuppressed(var14);
                }
                throw var15;
            }
            scanner.close();
        } catch (NumberFormatException var16) {
            var16.printStackTrace();
        }

    }
}
