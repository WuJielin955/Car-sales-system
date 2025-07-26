package myproject.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import myproject.entity.AddressEntity;
import myproject.vo.AddressVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-10T18:15:12+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_271 (Oracle Corporation)"
)
public class AddressConvertImpl implements AddressConvert {

    @Override
    public AddressEntity convert(AddressVO vo) {
        if ( vo == null ) {
            return null;
        }

        AddressEntity addressEntity = new AddressEntity();

        addressEntity.setId( vo.getId() );
        addressEntity.setAddtime( vo.getAddtime() );
        addressEntity.setUserid( vo.getUserid() );
        addressEntity.setAddress( vo.getAddress() );
        addressEntity.setName( vo.getName() );
        addressEntity.setPhone( vo.getPhone() );
        addressEntity.setIsdefault( vo.getIsdefault() );

        return addressEntity;
    }

    @Override
    public AddressVO convert(AddressEntity entity) {
        if ( entity == null ) {
            return null;
        }

        AddressVO addressVO = new AddressVO();

        addressVO.setId( entity.getId() );
        addressVO.setAddtime( entity.getAddtime() );
        addressVO.setUserid( entity.getUserid() );
        addressVO.setAddress( entity.getAddress() );
        addressVO.setName( entity.getName() );
        addressVO.setPhone( entity.getPhone() );
        addressVO.setIsdefault( entity.getIsdefault() );

        return addressVO;
    }

    @Override
    public List<AddressVO> convertList(List<AddressEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<AddressVO> list1 = new ArrayList<AddressVO>( list.size() );
        for ( AddressEntity addressEntity : list ) {
            list1.add( convert( addressEntity ) );
        }

        return list1;
    }
}
