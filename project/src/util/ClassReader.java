/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2017 Oracle and/or its affiliates. All rights reserved.
 *
 * Oracle and Java are registered trademarks of Oracle and/or its affiliates.
 * Other names may be trademarks of their respective owners.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common
 * Development and Distribution License("CDDL") (collectively, the
 * "License"). You may not use this file except in compliance with the
 * License. You can obtain a copy of the License at
 * http://www.netbeans.org/cddl-gplv2.html
 * or nbbuild/licenses/CDDL-GPL-2-CP. See the License for the
 * specific language governing permissions and limitations under the
 * License.  When distributing the software, include this License Header
 * Notice in each file and include the License file at
 * nbbuild/licenses/CDDL-GPL-2-CP.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the GPL Version 2 section of the License file that
 * accompanied this code. If applicable, add the following below the
 * License Header, with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * If you wish your version of this file to be governed by only the CDDL
 * or only the GPL Version 2, indicate your decision by adding
 * "[Contributor] elects to include this software in this distribution
 * under the [CDDL or GPL Version 2] license." If you do not indicate a
 * single choice of license, a recipient has the option to distribute
 * your version of this file under either the CDDL, the GPL Version 2 or
 * to extend the choice of license to its licensees as provided above.
 * However, if you add GPL Version 2 code and therefore, elected the GPL
 * Version 2 license, then the option applies only if the new code is
 * made subject to such option by the copyright holder.
 *
 * Contributor(s): John Marmion, Jon Herrera, John Winebrenner, John Pardi, John Pardi, John Paddie, John Wick,Marmajohn, John Adams
 */
package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author ford.terrell
 */
public class ClassReader {

    public static void reparseClasses(File file) throws FileNotFoundException, IOException {
        Scanner s = new Scanner(file);
        PrintWriter p = new PrintWriter(new File("classes.csv"));
        String subject = "", name = "", credit = "", code = "";
        while (s.hasNextLine()) {
            for (int i = 0; i < 3; i++) {
                String data = s.nextLine();
                if (data.contains("~")) {
                    subject = data.replace("~", "");
                    i--;
                    continue;
                }
                switch (i) {
                    case 0:
                        credit = data;
                        break;
                    case 1:
                        name = data;
                        break;
                    case 2:
                        code = data;
                        break;
                }
            }
            if (name.split(",").length != code.split(",").length) {
                System.out.println("search up: " + name);
            }
            p.println(code + "," + name + "," + subject + "," + credit + "," + getGPAWeight(name, code)); // order of data: <code>,<name>,<category>,<credit>,<weight>
        }
        p.close();
    }

    private static int getGPAWeight(String name, String code) {
        if(code.endsWith("IB") || name.endsWith("AP"))
            return 6;
        if(name.contains("Dual"))
            return 0;
        return 5;
    }
}
