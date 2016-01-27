package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ScoreResult;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.fuwu.scores.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class FuwuScoresGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4727436257217498884L;

    /**
     * 评价流水记录
     */
    @ApiListField("score_result")
    @ApiField("score_result")
    private List<ScoreResult> scoreResult;

    public List<ScoreResult> getScoreResult() {
        return this.scoreResult;
    }

    public void setScoreResult(List<ScoreResult> scoreResult) {
        this.scoreResult = scoreResult;
    }

}
