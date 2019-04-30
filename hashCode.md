**hashCode 규약**

같은 자바 어플리케이션에서 실행된다면, equals에서 비교하는 맴버 변수가 변경되지 않는다면 같은 int 값을 리턴해야합니다.

equals 에서 쓰는 맴버 변수를 hashCode를 구현하는데도 똑같이 쓰면됩니다.

결국 eqauls 의 구현과 hashCode의 구현은 동떨어질 수 없습니다.

a1.equals(a2) 가 true 이면 hashCode은 같은값을 리턴해야합니다.

a1.equals(a2)가 false일 경우 a1의 hashCode와 a2의 hashCode가 반드시 다른 값을 리턴할 필요는 없지만, 가능하면 다른 값을 리턴하는 게 좋습니다.

