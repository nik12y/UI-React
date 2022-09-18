package com.example.demo.questionCategory;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "IDGC_COE_QUE_CAT_DETAIL_CNFG")
@Inheritance(strategy = InheritanceType.JOINED)
@ToString
//@IdClass(QuestionCatDetailsKey.class)
public class QuestionCatDetails  {

    @Id
    @Column(name = "que_cat_detail_id")
    private String questionCategoryDetailId;
    @Column(name = "que_nature")
    private String questionNature;
    @Column(name = "parent_question_id")
    private String parentQuestionId;
    @Column(name = "display_condition")
    private String displayCondition;

//    @ManyToOne
//    @JoinColumn(name = "question_category_id")
//    private QuestionCategory questionCategory;
//
//    @OneToMany
//    @JoinColumn(name = "question_id")
//    private List<QuestionEntity> questionEntities=new ArrayList<>();




    private String status;
    private Integer recordVersion;
    private String authorized;
    private String lastConfigurationAction;

}
