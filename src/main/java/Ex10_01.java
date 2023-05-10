public class Ex10_01 {
    public static void main(String[] args) {
        int[] aa = new int[3];
        try {
            aa[2] = 100/0;
            aa[3] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 첨자가 배열 크기보다 커요~");
            System.out.println("오류 메시지 : " + e);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눠서 오류에요~");
            System.out.println("오류 메시지 : " + e);
        } catch (Exception e) {
            System.out.println("자바에서 발생되는 모든 오류를 잡을 수 있어요~");
            System.out.println("오류 메시지 : " + e);
            // Exception을 사용하려면 catch문 가장 마지막 순서로 사용해야함
        } finally {
            System.out.println("이 부분은 무조건 나와요");
        }
    }
}
