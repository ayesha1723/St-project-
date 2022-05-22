import org.testing.Assert;
import org.testing.annotations.Test;

public class UnitTesting{

   @Test
   public void test_ASCII(){
	var unit_obj = new Unit();
	Assert.assertEquals(unit_obj.compute_ASCII('A'),65);
   }
}