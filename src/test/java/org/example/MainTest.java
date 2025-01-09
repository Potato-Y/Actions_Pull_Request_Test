package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

  @Test
  @DisplayName("숫자를 더할 수 있다")
  void sum(){
    int a= 1;
    int b= 2;

    int result = Main.sum(a,b);

    assertEquals(a+b,result);
  }

  @Test
  @DisplayName("테스트에 실패한다")
  void sum2(){
    int a= 1;
    int b= 2;

    int result = Main.sum(a,b);

    assertEquals(a,result);
  }
}
