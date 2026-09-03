import java.util.*;
class Solution {
public int[] asteroidCollision(int[] asteroids) {
Stack<Integer> stack = new Stack<>();
for (int a : asteroids) {
boolean alive = true;
while (alive && !stack.isEmpty() && stack.peek() > 0 && a < 0) {
if (stack.peek() < -a) {
stack.pop(); // stack asteroid explodes
} else if (stack.peek() == -a) {
stack.pop(); // both explode
alive = false;
} else {
alive = false; // current explodes
}
}
if (alive) stack.push(a);
}
int[] result = new int[stack.size()];
for (int i = result.length - 1; i >= 0; i--) {
result[i] = stack.pop();
}
return result;
}
}