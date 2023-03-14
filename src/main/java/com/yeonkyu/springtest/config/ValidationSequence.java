package com.yeonkyu.springtest.config;

import com.yeonkyu.springtest.config.ValidationGroups.NotBlankGroup;
import com.yeonkyu.springtest.config.ValidationGroups.PatternCheckGroup;

import javax.validation.GroupSequence;

@GroupSequence({NotBlankGroup.class, PatternCheckGroup.class})
public interface ValidationSequence {
}
