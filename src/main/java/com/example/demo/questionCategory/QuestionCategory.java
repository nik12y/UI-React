package com.example.demo.questionCategory;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "IDGC_COE_QUESTION_CATEGORY_CNFG")
@Inheritance(strategy = InheritanceType.JOINED)
@ToString
//@IdClass(QuestionCategoryKey.class)
public class QuestionCategory  {

    @Id
    @Column(name = "question_category_id")
    private String questionCategoryId;
    @Column(name = "question_category_name")
    private String questionCategoryName;
    @Column(name = "question_display")
    private String questionDisplay;
    @Column(name = "is_show_que_category_name")
    private String isShowQuestionCategoryName;
    @Column(name = "is_enable_document_upload")
    private String isEnableDocumentUpload;
//
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "question_category_id")
//    private List<QuestionCatDetails> questionCatDetails = new ArrayList<>();

    private String status;
    private Integer recordVersion;
    private String authorized;
    private String lastConfigurationAction;
}
