import entity.EmployeeEntity;
import entry.EmployeeEntry;
import mapper.AutoMapper;
import org.junit.Assert;
import org.junit.Test;

public class Tester {

    @Test
    public void testEntryToEntityConverison() {
        EmployeeEntry entry = new EmployeeEntry();
        entry.setId(1);
        entry.setName("Adesh");
        EmployeeEntity entity = AutoMapper.INSTANCE.convertEntryToEntity(entry);
        Assert.assertEquals(entry.getId(),entity.getId());
        Assert.assertEquals(entry.getName(),entity.getName());
    }

    @Test
    public void testEntitytoEntryConversion() {
        EmployeeEntity entity = new EmployeeEntity();
        entity.setId(1);
        entity.setName("Adesh");
        EmployeeEntry entry = AutoMapper.INSTANCE.convertEntityToEntry(entity);
        Assert.assertEquals(entity.getId(),entry.getId());
        Assert.assertEquals(entity.getName(),entry.getName());
    }
}
