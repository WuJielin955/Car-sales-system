package myproject.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import myproject.entity.JinhuoEntity;
import myproject.vo.JinhuoVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-10T18:15:12+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_271 (Oracle Corporation)"
)
public class JinhuoConvertImpl implements JinhuoConvert {

    @Override
    public JinhuoEntity convert(JinhuoVO vo) {
        if ( vo == null ) {
            return null;
        }

        JinhuoEntity jinhuoEntity = new JinhuoEntity();

        jinhuoEntity.setId( vo.getId() );
        jinhuoEntity.setName( vo.getName() );
        jinhuoEntity.setType( vo.getType() );
        jinhuoEntity.setModel( vo.getModel() );
        jinhuoEntity.setYear( vo.getYear() );
        jinhuoEntity.setPrice( vo.getPrice() );
        jinhuoEntity.setYinqin( vo.getYinqin() );
        jinhuoEntity.setBianshuqi( vo.getBianshuqi() );
        jinhuoEntity.setLichengshu( vo.getLichengshu() );
        jinhuoEntity.setColor( vo.getColor() );
        jinhuoEntity.setCheshen( vo.getCheshen() );
        jinhuoEntity.setNum( vo.getNum() );
        jinhuoEntity.setDetails( vo.getDetails() );
        jinhuoEntity.setPhoto( vo.getPhoto() );
        jinhuoEntity.setUserid( vo.getUserid() );
        jinhuoEntity.setUsername( vo.getUsername() );
        jinhuoEntity.setAddtime( vo.getAddtime() );

        return jinhuoEntity;
    }

    @Override
    public JinhuoVO convert(JinhuoEntity entity) {
        if ( entity == null ) {
            return null;
        }

        JinhuoVO jinhuoVO = new JinhuoVO();

        jinhuoVO.setId( entity.getId() );
        jinhuoVO.setName( entity.getName() );
        jinhuoVO.setType( entity.getType() );
        jinhuoVO.setModel( entity.getModel() );
        jinhuoVO.setYear( entity.getYear() );
        jinhuoVO.setPrice( entity.getPrice() );
        jinhuoVO.setYinqin( entity.getYinqin() );
        jinhuoVO.setBianshuqi( entity.getBianshuqi() );
        jinhuoVO.setLichengshu( entity.getLichengshu() );
        jinhuoVO.setColor( entity.getColor() );
        jinhuoVO.setCheshen( entity.getCheshen() );
        jinhuoVO.setNum( entity.getNum() );
        jinhuoVO.setDetails( entity.getDetails() );
        jinhuoVO.setPhoto( entity.getPhoto() );
        jinhuoVO.setUserid( entity.getUserid() );
        jinhuoVO.setUsername( entity.getUsername() );
        jinhuoVO.setAddtime( entity.getAddtime() );

        return jinhuoVO;
    }

    @Override
    public List<JinhuoVO> convertList(List<JinhuoEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<JinhuoVO> list1 = new ArrayList<JinhuoVO>( list.size() );
        for ( JinhuoEntity jinhuoEntity : list ) {
            list1.add( convert( jinhuoEntity ) );
        }

        return list1;
    }
}
