

-- ----------------------------
-- Records of tans_user
-- ----------------------------

DROP TABLE IF EXISTS trans_user;
CREATE TABLE trans_user (
    id varchar(225) NOT NULL,
    user_name varchar(50) NOT NULL COMMENT '用户名',
    email varchar(50) DEFAULT NULL COMMENT '邮箱',
    profession varchar(50) DEFAULT NULL COMMENT '职业',
    user_level varchar(50) DEFAULT 'Lv 1' COMMENT '等级',
    current_experience bigint(20) DEFAULT 0 COMMENT '经验',
    created_time datetime NOT NULL,
    updated_time datetime NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `email` USING BTREE (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of trans_user
-- ----------------------------
INSERT INTO trans_user VALUES ('1','李四','126165464@qq.com','学生','LV 1','0','2019-2-13 14:41:57','2019-2-13 14:41:57');
INSERT INTO trans_user VALUES ('2','王五','126265464@qq.com','学生','LV 1','0','2019-2-13 14:41:57','2019-2-13 14:41:57');
INSERT INTO trans_user VALUES ('3','赵六','126365464@qq.com','学生','LV 1','0','2019-2-13 14:41:57','2019-2-13 14:41:57');
INSERT INTO trans_user VALUES ('4','黄七','126465464@qq.com','学生','LV 1','0','2019-2-13 14:41:57','2019-2-13 14:41:57');



-- ----------------------------
-- Records of trans_team
-- ----------------------------
DROP TABLE IF EXISTS trans_team;
CREATE TABLE trans_team (
    id bigint(20) NOT NULL AUTO_INCREMENT,
    user_id varchar(225) NOT NULL COMMENT '创建人id',
    team_name varchar(50) NOT NULL COMMENT '组名',
    member_quantity int(11) NOT NULL COMMENT '成员数量',
    organization varchar(50) COMMENT '组织名',
    team_describe text COMMENT '小组描述',
    team_pic varchar(50) COMMENT '小组封面',
    sort_order int DEFAULT 0 COMMENT '排序',
    created_time datetime NOT NULL,
    updated_time datetime NOT NULL,
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='小组表';


-- ----------------------------
-- Records of tans_team
-- ----------------------------
INSERT INTO trans_team VALUES ('1','1','旅行诗人','1','惠州学院','这是一个十分强大的团队',null,'0','2019-2-13 14:41:57','2019-2-13 14:41:57');
INSERT INTO trans_team VALUES ('2','1','新东方','1','惠州学院','这是一个十分强大的团队',null,'0','2019-2-13 14:41:57','2019-2-13 14:41:57');
INSERT INTO trans_team VALUES ('3','2','美丽人生','1','惠州学院','这是一个十分强大的团队',null,'0','2019-2-13 14:41:57','2019-2-13 14:41:57');
INSERT INTO trans_team VALUES ('4','2','教父','1','惠州学院','这是一个十分强大的团队',null,'0','2019-2-13 14:41:57','2019-2-13 14:41:57');
INSERT INTO trans_team VALUES ('5','3','美国往事','1','惠州学院','这是一个十分强大的团队',null,'0','2019-2-13 14:41:57','2019-2-13 14:41:57');



-- ----------------------------
-- Records of trans_user_team
-- ----------------------------

DROP TABLE IF EXISTS trans_user_team;
CREATE TABLE trans_user_team (
    user_id varchar(225) NOT NULL COMMENT '用户id',
    team_id bigint(20) NOT NULL COMMENT '小组id',
    new_data int DEFAULT 0 COMMENT '是否有新数据',
    PRIMARY KEY (user_id,team_id),
    CONSTRAINT `trans_user_team_1` FOREIGN KEY (`user_id`) REFERENCES `trans_user` (`id`) ON DELETE CASCADE ,
    CONSTRAINT `trans_user_team_2` FOREIGN KEY (`team_id`) REFERENCES `trans_team` (`id`) ON DELETE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='小组用户关系表';


-- ----------------------------
-- Records of trans_user_team
-- ----------------------------

INSERT INTO trans_user_team VALUES ('1','1','1');
INSERT INTO trans_user_team VALUES ('2','2','0');
INSERT INTO trans_user_team VALUES ('2','3','0');



-- ----------------------------
-- Records of trans_task
-- ----------------------------

DROP TABLE IF EXISTS trans_task;
CREATE TABLE trans_task (
    id bigint(20) NOT NULL AUTO_INCREMENT,
    user_id varchar(225) NOT NULL COMMENT '用户id',
    team_id bigint(20) NOT NULL COMMENT '小组id',
    task_title varchar(225) COMMENT '任务标题',
    task_status int DEFAULT 0 COMMENT '完成任务的状态，默认是未完成',
    task_grouping varchar(225) COMMENT '用户自己分组',
    task_details text COMMENT '任务详情',
    task_translate text COMMENT '已翻译文本',
    source_file varchar(300) COMMENT '要翻译的文件',
    translate_file varchar(300) COMMENT '翻译好的文件',
    task_deadline date COMMENT '任务期限',
    task_type int DEFAULT 0 COMMENT '任务的类别：0为英译中，1为中译英',
    task_schedule varchar(225) COMMENT '任务的进度，还剩下几天',
    created_time datetime NOT NULL,
    updated_time datetime NOT NULL,
    PRIMARY KEY (`id`),
    CONSTRAINT `trans_task_1` FOREIGN KEY (`team_id`) REFERENCES `trans_team` (`id`) ON DELETE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='任务表';


-- ----------------------------
-- Records of tans_task
-- ----------------------------
INSERT INTO trans_task VALUES ('1','1','1','西游记','0','第一次','Journey to the West is one of the Four Great Classical Novels of Chinese literatures.It is written in
16th century Ming dynasty.It tells a story about a Buddhist monk and his three students who are animals but with human characteristic.They travel west to India to find
Buddhist scriptures.The monk,called XuanZang or Tangsheng,is an idealist,who is as weak as a kitten and just sets there helplessly for rescue when he gets into
trouble.But he is really kind and great,trying to dispel the darkness and ignorance in people’s heart.The monkey named Wukong is born from a stone and he owns
extraordinary powers and amazing intelligence that he uses to overcome demons and monsters.The pig is Bajie.He loves beauty and delicacy and he always makes a mess and
generates a lot of humor in the process.The loach is called ShaSeng and he is very modest and diligent; he takes care of the monk and
colleagues.',null,null,null,'2018-2-13 14:41:57','0','2','2018-2-13 14:41:57','2018-2-13 14:41:57');

INSERT INTO trans_task VALUES ('2','1','1','三国演义','0','第二次','the romance of three kingdoms is one of the most famous books in china.it is begining from the late
han dynasty to the early jin dynasty,about one centry.the anthor of it is luo guanzhong.luo guanzhong was born in ming dynasty.he was also the writer of water
marsh.there are approximately 500 people in this novel.it is such a great novel.the heroes in the book have different personalities.for example,caocao,the most
important person in the time of late han dynasty,he was very cunning.guan yu ,who is the second brother of liubei,he was very faithful to his lord.all of the people in
china know liubei,guanyu and zhangfei.they swore brotherhood in the peach garden.at last,liubei became the lord of shuhan kingdom.but unfortunately,in the end,liubei
,caocao,sunquan all dead.and none of the kingdoms won the whole land.the sima family were the finally winners.perhaps you think it is very cool to work at that
time,but i dont think so.peace is more important.',null,null,null,'2018-2-13 14:41:57','0','2','2018-2-13 14:41:57','2018-2-13 14:41:57');

INSERT INTO trans_task VALUES ('3','1','1','大话西游','0','第二次','the romance of three kingdoms is one of the most famous books in china.it is begining from the late
han dynasty to the early jin dynasty,about one centry.the anthor of it is luo guanzhong.luo guanzhong was born in ming dynasty.he was also the writer of water
marsh.there are approximately 500 people in this novel.it is such a great novel.the heroes in the book have different personalities.for example,caocao,the most
important person in the time of late han dynasty,he was very cunning.guan yu ,who is the second brother of liubei,he was very faithful to his lord.all of the people in
china know liubei,guanyu and zhangfei.they swore brotherhood in the peach garden.at last,liubei became the lord of shuhan kingdom.but unfortunately,in the end,liubei
,caocao,sunquan all dead.and none of the kingdoms won the whole land.the sima family were the finally winners.perhaps you think it is very cool to work at that
time,but i dont think so.peace is more important.',null,null,null,'2018-2-13 14:41:57','0','2','2018-2-13 14:41:57','2018-2-13 14:41:57');



-- ----------------------------
-- Records of trans_notice
-- ----------------------------
DROP TABLE IF EXISTS trans_notice;
CREATE TABLE trans_notice (
    id bigint(20) NOT NULL AUTO_INCREMENT,
    team_id bigint(20) NOT NULL COMMENT '小组id',
    notice_content text COMMENT '小组公告内容',
    notice_title varchar(225) COMMENT '小组公告标题',
    publish_name varchar(225) COMMENT '发布人姓名',
    created_time datetime NOT NULL,
    updated_time datetime NOT NULL,
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='小组公告表';


-- ----------------------------
-- Records of trans_notice
-- ----------------------------
INSERT INTO trans_notice VALUES ('1','1','今晚吃鸡,大吉大利','吃鸡','李四','2018-2-13 14:41:57','2019-2-13 14:41:57');
INSERT INTO trans_notice VALUES ('2','1','吃葡萄不吐葡萄皮，不吃葡萄倒吐葡萄皮','顺口溜','李四','2019-2-13 14:41:57','2019-2-13 14:41:57');



-- ----------------------------
-- Records of trans_reward
-- ----------------------------
DROP TABLE IF EXISTS trans_reward;
CREATE TABLE trans_reward (
    id bigint(20) NOT NULL AUTO_INCREMENT,
    user_id varchar(225) NOT NULL COMMENT '用户id',
    reward_status int DEFAULT 0 COMMENT '采纳1，未采纳0',
    reward_information text  COMMENT '悬赏详情',
    reward_schedule varchar(225) COMMENT '悬赏进度，剩余多少天',
    reward_experience int DEFAULT 0 COMMENT '悬赏的经验',
    total_attention int DEFAULT 0 COMMENT '关注人数',
    reward_type int DEFAULT 0 COMMENT '悬赏的类型，0为英译中，1为中译英',
    reward_money int DEFAULT 0 COMMENT '悬赏的金额',
    upload_file varchar(300) COMMENT '上传的文件',
    deadline datetime COMMENT '截止日期',
    categoryId int DEFAULT 1 COMMENT '悬赏分类，1为计算，2为金融，3为体育',
    created_time datetime NOT NULL,
    updated_time datetime NOT NULL,
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='悬赏表';

-- ----------------------------
-- Records of trans_reward
-- ----------------------------
INSERT INTO trans_reward VALUES ('1','1','0','the romance of three kingdoms is one of the most famous books in china.it is begining from the late han dynasty to the
early jin dynasty,about one centry.the anthor of it is luo guanzhong.luo guanzhong was born in ming dynasty.he was also the writer of water
marsh.','4','5','5','0','60',null,'2018-2-13 14:41:57',1,'2018-2-13 14:41:57','2019-2-13 14:41:57');
INSERT INTO trans_reward VALUES ('2','1','0','A few days ago, I went to the railway station to see my friend off. On the way I saw street leaners burning garbage. I
know they were trying to get rid of rubbish in a way they thought was“Taking a shortcut.” I don’t think, however, it’s proper to clear away rubbish by such a
means.','1','5','4','0','60',null,'2018-2-13 14:41:57',1,'2019-2-13 14:41:57','2018-2-13 14:41:57');
INSERT INTO trans_reward VALUES ('3','1','0','Burning things does harm to people. It’s known to all that burning rubbish will give off poisonous smoke and dust which
in turn pollute air. Many people contract cancer as a result of breathing the polluted air. Some of them even die of it.','2','5','2','0','60',null,'2018-2-13
14:41:57','2018-2-13 14:41:57','2019-2-13 14:41:57');
INSERT INTO trans_reward VALUES ('4','1','0','As we know, TV plays an important part in our daily life. It’s quicker and more convenient to get information from TV
than from newspapers. Providing us with lively and interesting moving pictures, TV enables us not only to see what is happening in the world but to learn many things,
including foreign languages. So it is not reasonable to forbid students to watch TV. But watching TV too long is not good. Sitting in front of TV all day does harm to
our eyes and wastes our time for study.','5','5','0','0','60',null,'2018-2-13 14:41:57',1,'2018-2-13 14:41:57','2018-2-13 14:41:57');
INSERT INTO trans_reward VALUES ('5','1','0','As, middle school students, we must study hard and study English well. English will be more useful than ever before in
the world. Most important of all, support our country at this time of challenge.','4','5','2','0','60',null,'2018-2-13 14:41:57',1,'2018-2-13 14:41:57','2018-2-13
14:41:57');
INSERT INTO trans_reward VALUES ('6','2','0','WTO is an international organization that works to guarantee fair trade between many nations. It was established on
January 1st, !1995, taking the place of Multilateral Trade Organization. Now China has entered into WTO and become a member of it. In the future it will be e,nvenient
for our country to develop trade relations with many other nations; And any dispute will be handled constructively under the same
rules.','4','5','4','0','60',null,'2018-2-13 14:41:57',1,'2018-2-13 14:41:57','2018-2-13 14:41:57');
INSERT INTO trans_reward VALUES ('7','2','0','I think that Chinas entry into WTO will have a lot of long-term social and economic benefits. It can enhance economic
growth aad will have much influence on peoples ideology.','3','5','0','0','60',null,'2018-2-13 14:41:57',1,'2018-2-13 14:41:57','2018-2-13 14:41:57');
INSERT INTO trans_reward VALUES ('8','2','0','You can donate money or materials. If you would like to donate money, please put your money into the donation box at the
entrance to Teaching Building. Two volunteer students are available there to offer help if necessary. (www.zuowenla.cn)If you would like to donate clothes, quilts or
others, please bring them to our stand in front of the school gate.','4','5','1','0','60',null,'2018-2-13 14:41:57',1,'2018-2-13 14:41:57','2018-2-13 14:41:57');
INSERT INTO trans_reward VALUES ('9','2','0','The Donation program will be held between 11:00 and 14:00, tomorrow and the day after tomorrow.All the donated money and
materials will be collected in order and submitted to Chinese Red Cross Foundation as soon as possible.','4','5','2','0','60',null,'2018-2-13 14:41:57',1,'2018-2-13
14:41:57','2018-2-13 14:41:57');
INSERT INTO trans_reward VALUES ('10','2','0','But, fortunately, love is around us: the Communist party helps us, the army helps us, the people all over the world help
us. They offer us with money, goods, love and so on !','2','5','2','0','60',null,'2019-2-13 14:41:57',1,'2019-2-13 14:41:57','2019-2-13 14:41:57');



-- ----------------------------
-- Records of trans_reward_user
-- ----------------------------

DROP TABLE IF EXISTS trans_reward_user;
CREATE TABLE trans_reward_user (
    user_id varchar(225) NOT NULL COMMENT '用户id',
    reward_id bigint(20) NOT NULL COMMENT '悬赏id',
    is_get int DEFAULT 0 COMMENT '是否被领取,1为已领取0为未领取',
    is_attention int DEFAULT 0 COMMENT '是否被关注,1为已关注，0为未关注',
    is_adopt int DEFAULT 0 COMMENT '是否被采纳',
    is_Submission int DEFAULT 0 COMMENT '是否提交',
    sort_order int DEFAULT 0 COMMENT '排序',
    translation text COMMENT '悬赏译本',
    translation_file varchar(300) COMMENT '悬赏文件',
    updated_time datetime NOT NULL,
    PRIMARY KEY (user_id,reward_id),
    CONSTRAINT `trans_reward_user_1` FOREIGN KEY (`user_id`) REFERENCES `trans_user` (`id`) ON DELETE CASCADE ,
    CONSTRAINT `trans_reward_user_2` FOREIGN KEY (`reward_id`) REFERENCES `trans_reward` (`id`) ON DELETE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='悬赏用户关系表';

-- ----------------------------
-- Records of trans_reward_user
-- ----------------------------


-- ----------------------------
-- Records of trans_reward_category
-- ----------------------------

DROP TABLE IF EXISTS trans_reward_category;
CREATE TABLE trans_reward_category (
    id bigint(20) NOT NULL AUTO_INCREMENT,
    reward_id bigint(20) NOT NULL COMMENT '悬赏id',
    category_name varchar(225) NOT NULL COMMENT '分类名称',
    parent_id bigint(20) COMMENT '父节点',
    status int COMMENT '分类状态，是否存在',
    sort_order int COMMENT '排序',
    created_time datetime NOT NULL,
    updated_time datetime NOT NULL,
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='分类表';

-- ----------------------------
-- Records of tans_reward_category
-- ----------------------------
INSERT INTO trans_reward_category VALUES ('1','0','计算机','0','1','1','2019-2-13 14:41:57','2019-2-13 14:41:57');
INSERT INTO trans_reward_category VALUES ('2','0','金融','0','1','1','2019-2-13 14:41:57','2019-2-13 14:41:57');
INSERT INTO trans_reward_category VALUES ('3','0','体育','0','1','1','2019-2-13 14:41:57','2019-2-13 14:41:57');