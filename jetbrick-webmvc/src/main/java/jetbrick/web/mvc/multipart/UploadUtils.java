/**
 * Copyright 2013-2014 Guoqiang Chen, Shanghai, China. All rights reserved.
 *
 *   Author: Guoqiang Chen
 *    Email: subchen@gmail.com
 *   WebURL: https://github.com/subchen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrick.web.mvc.multipart;

import java.io.File;
import jetbrick.util.*;
import jetbrick.web.mvc.config.WebConfig;

public final class UploadUtils {

    /**
     * 返回一个上传的临时文件名.
     */
    public static File getUniqueTemporaryFile(String originalFilename) {
        String fileExt = FilenameUtils.getFileExtension(originalFilename);
        String fileName = RandomStringUtils.randomAlphanumeric(16);

        if (StringUtils.isNotEmpty(fileExt)) {
            fileName = fileName + "." + fileExt;
        }

        File uploaddir = WebConfig.getInstance().getUploaddir();
        return new File(uploaddir, fileName);
    }

}
