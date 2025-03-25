package ra.presentation;
import ra.entity.Student;

import java.util.*;
public class StudentManagement {
    public static void main(String[] args) {

        Map<String, Student> students = new HashMap<>();
        do{
            System.out.println("********************MENU*******************");
            System.out.println("1. Danh sách sinh viên");
            System.out.println("2. Thêm mới các sinh viên");
            System.out.println("3. Xóa sinh viên theo mã sinh viên");
            System.out.println("4. Tính điểm trung bình của tất cả sinh viên");
            System.out.println("5. In thông tin sinh viên có điểm trung bình lớn ớn nhất");
            System.out.println("6. In thông tin sinh viên có tuổi nhỏ nhất");
            System.out.println("7. Thoát");
            System.out.println("*******************************************");
            System.out.println("Lựa chọn của bạn: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Danh sách sinh viên: ");
                    for (Map.Entry<String, Student> entry : students.entrySet()){
                        System.out.println(entry.getValue());
                    }
                    break;
                case 2:
                    System.out.println("Nhập số lượng sinh viên cần thêm: ");
                    int n = scanner.nextInt();
                    for (int i = 0; i < n; i++){
                        Student student = new Student();
                        student.inputData(scanner);
                        students.put(student.getId(), student);
                    }
                    break;
                case 3:
                    System.out.println("Nhập mã sinh viên cần xóa: ");
                    String id = scanner.next();
                    students.remove(id);
                    break;
                case 4:
                    float sum = 0;
                    for (Map.Entry<String, Student> entry : students.entrySet()){
                        sum += entry.getValue().getScore();
                    }
                    System.out.println("Điểm trung bình của tất cả sinh viên: " + sum/students.size());
                    break;
                case 5:
                    List<Student> studentList = new ArrayList<>(students.values());
                    studentList.sort((s1, s2) -> {
                        if (s1.getScore() < s2.getScore()) return 1;
                        else if (s1.getScore() > s2.getScore()) return -1;
                        else return 0;
                    });
                    System.out.println("Thông tin sinh viên có điểm trung bình lớn nhất: ");
                    System.out.println(studentList.getFirst());
                    break;
                case 6:
                    List<Student> studentList1 = new ArrayList<>(students.values());
                    studentList1.sort(Comparator.comparing(Student::getAge));
                    System.out.println("Thông tin sinh viên có tuổi nhỏ nhất: ");
                    System.out.println(studentList1.getFirst());
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        } while (true);
    }
}
