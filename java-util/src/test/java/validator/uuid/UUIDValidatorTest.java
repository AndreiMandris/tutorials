package validator.uuid;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UUIDValidatorTest {

  @Test
  public void whenValidUUIDStringIsValidated_thenValidationSucceeds() {
    Assertions.assertTrue(
        UUIDCustomValidator.isUUID("26929514-237c-11ed-861d-0242ac120002"));
  }

  @Test
  public void whenUUIDIsValidatedUsingRegex_thenValidationSucceeds() {
    Assertions.assertTrue(RegexUUIDValidator.isUUID("26929514-237c-11ed-861d-0242ac120002"));
  }
}
