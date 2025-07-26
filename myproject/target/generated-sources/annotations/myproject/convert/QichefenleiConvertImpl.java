package myproject.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import myproject.entity.QichefenleiEntity;
import myproject.vo.QichefenleiVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-10T18:15:12+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_271 (Oracle Corporation)"
)
public class QichefenleiConvertImpl implements QichefenleiConvert {

    @Override
    public QichefenleiEntity convert(QichefenleiVO vo) {
        if ( vo == null ) {
            return null;
        }

        QichefenleiEntity qichefenleiEntity = new QichefenleiEntity();

        qichefenleiEntity.setId( vo.getId() );
        qichefenleiEntity.setName( vo.getName() );
        qichefenleiEntity.setPhoto( vo.getPhoto() );
        qichefenleiEntity.setAddtime( vo.getAddtime() );

        return qichefenleiEntity;
    }

    @Override
    public QichefenleiVO convert(QichefenleiEntity entity) {
        if ( entity == null ) {
            return null;
        }

        QichefenleiVO qichefenleiVO = new QichefenleiVO();

        qichefenleiVO.setId( entity.getId() );
        qichefenleiVO.setName( entity.getName() );
        qichefenleiVO.setPhoto( entity.getPhoto() );
        qichefenleiVO.setAddtime( entity.getAddtime() );

        return qichefenleiVO;
    }

    @Override
    public List<QichefenleiVO> convertList(List<QichefenleiEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<QichefenleiVO> list1 = new ArrayList<QichefenleiVO>( list.size() );
        for ( QichefenleiEntity qichefenleiEntity : list ) {
            list1.add( convert( qichefenleiEntity ) );
        }

        return list1;
    }
}
