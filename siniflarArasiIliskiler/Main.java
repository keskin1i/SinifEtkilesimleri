package siniflarArasiIliskiler;

public class Main {
    public static void main(String[] args) {
        Student s1=new Student("ali","cem","123","aa",95);
        Student s2=new Student("veli","tarık","456","cc",90);
        Student s3=new Student("jon","lon","789","dd",120);

        Instructer i1=new Instructer("mahmut","123","Ceng");

        Course mat=new Course("mat","101",i1);
        System.out.println(mat.getInstructer().getName());
      /*  Student[] stu={s1,s2,s3};
        mat.calcAvarge(stu);
        System.out.println("Ortalama: "+mat.calcAvarge(stu));*/


    }
}
