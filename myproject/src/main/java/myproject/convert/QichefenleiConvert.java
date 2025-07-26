package myproject.convert;

import myproject.entity.QichefenleiEntity;
import myproject.vo.QichefenleiVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
* 汽车分类
*
*/
@Mapper
public interface QichefenleiConvert {
    QichefenleiConvert INSTANCE = Mappers.getMapper(QichefenleiConvert.class);

    QichefenleiEntity convert(QichefenleiVO vo);

    QichefenleiVO convert(QichefenleiEntity entity);

    List<QichefenleiVO> convertList(List<QichefenleiEntity> list);

}