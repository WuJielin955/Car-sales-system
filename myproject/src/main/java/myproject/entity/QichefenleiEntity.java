package myproject.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.baomidou.mybatisplus.annotation.*;
    import java.util.Date;

/**
* 汽车分类
*
*/

@Data
@TableName("qichefenlei")
public class QichefenleiEntity {
        /**
        * 主键
        */
        @TableId
        private Long id;

        /**
        * 汽车分类的名字
        */
        private String name;

        /**
        * 汽车分类的图片
        */
        private String photo;

        /**
        * 创建时间
        */
        @TableField(fill = FieldFill.INSERT)
        private Date addtime;

}