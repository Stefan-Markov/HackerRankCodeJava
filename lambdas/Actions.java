package lambdas;

import java.util.function.Predicate;

public interface Actions {

    Predicate<Integer> isOddValue = s -> s % 2 == 0;

    Predicate<String> isPalindrome = s -> {
        StringBuilder sb = new StringBuilder(s).reverse();
        return sb.toString().equals(s);
    };

    Predicate<Integer> isComposite = a -> {
        if (a != 1) {
            for (int i = 2; i < Math.sqrt(a); i++)
                if (a % i == 0) {
                    return false;
                }
        }
        return true;
    };
}
