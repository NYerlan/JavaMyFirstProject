public class EmployeeUtils {

//    поиск сотрудника в массиве по его имени:
    public int findByName(String name, Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (name.equals(arr[i].getName())) {
               return i;
            }
        }
        return -1;
    }
//    поиск сотрудника в массиве по вхождению указанной строки в его имени:
    public int findBySubName(String subname, Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().contains(subname)) {
                return i;
            }
        }
        return -1;
    }
//    подсчет зарплатного бюджета для всех сотрудников в массиве:
    public int salarySum(Worker[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i].getSalaryWorker();
            }
        return result;
    }

//    поиск наименьшей зарплаты в массиве:
    public int findMinSalary(Worker[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i].getSalaryWorker()) {
                min = arr[i].getSalaryWorker();
            }
        }
        return min;
    }

//    поиск наибольшей зарплаты в массиве:
    public int findMaxSalary(Worker[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i].getSalaryWorker()) {
                max = arr[i].getSalaryWorker();
            }
        }
        return max;
    }
//    поиск наименьшего количества подчиненных в массиве менеджеров:
    public int findMinQntyOfSubordinates(Manager[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i].getQuantityOfSubordinates()) {
                min = arr[i].getQuantityOfSubordinates();
            }
        }
        return min;
    }

//    поиск наибольшего количества подчиненных в массиве менеджеров:
    public int findMaxSalary(Manager[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i].getQuantityOfSubordinates()) {
                max = arr[i].getQuantityOfSubordinates();
            }
        }
        return max;
    }
//    поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров:
    public int findMaxBonus(Manager[] arr) {
        int maxBonus = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maxBonus < (arr[i].getSalaryManager() - arr[i].getBaseSalary())) {
                maxBonus = arr[i].getSalaryManager() - arr[i].getBaseSalary();
            }
        }
        return maxBonus;
    }

//    поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров:
    public int findMinBonus(Manager[] arr) {
        int minBonus = 0;
        for (int i = 0; i < arr.length; i++) {
            if (minBonus > (arr[i].getSalaryManager() - arr[i].getBaseSalary())) {
                minBonus = arr[i].getSalaryManager() - arr[i].getBaseSalary();
            }
        }
        return minBonus;
    }
}
