package myproject.entity;

import lombok.Data;
import com.baomidou.mybatisplus.annotation.*;
    import java.util.Date;

/**
* 地址
*
*/

@Data
@TableName("address")
public class AddressEntity {
        /**
        * 主键
        */
        @TableId
        private Long id;

        /**
        * 创建时间
        */
        @TableField(fill = FieldFill.INSERT)
        private Date addtime;

        /**
        * 用户id
        */
        private Long userid;

        /**
        * 地址
        */
        private String address;

        /**
        * 收货人
        */
        private String name;

        /**
        * 电话
        */
        private String phone;

        /**
        * 是否默认地址[是/否]
        */
        private String isdefault;

}