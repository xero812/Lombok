package mapper;


import entity.EmployeeEntity;
import entry.EmployeeEntry;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoMapper {

    AutoMapper INSTANCE = Mappers.getMapper(AutoMapper.class);

    public EmployeeEntity convertEntryToEntity(EmployeeEntry entry);

    public EmployeeEntry convertEntityToEntry(EmployeeEntity entity);

}