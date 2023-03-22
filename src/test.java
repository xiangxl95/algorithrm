import javafx.util.Pair;

import java.util.*;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        //System.out.println(romanToInt("IX"));
        //System.out.println(isMatch("aaabbbaabaaaaababaabaaabbabbbbbbbbaabababbabbbaaaaba", "a*******b"));
        /*TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        root.left = node2;
        root.right = node5;
        node2.left = node3;
        node2.right = node4;
        //inorderTraversal(root);
        isValidBST(root);*/
        //search(new int[]{5,1,2,3,4}, 1);
        //fullArrangement(new int[]{2,3,6,7});
        //combinationSum(new int[]{7,3,6,2}, 7);
        //combinationSum2(new int[]{10,1,2,7,6,1,5}, 8);
        //firstMissingPositive(new int[]{1,1});
        //trap(new int[]{2,8,5,5,6,1,7,4,5});
        //mySqrt(8);
        //binarySearch(new int[]{3,5,1}, 3);
        //singleNonDuplicate(new int[]{1,1,2,2,3,3,4,8,8});
        //findKthLargest(new int[]{3,2,1,5,6,4}, 2);
        int[] nums = new int[]{3,2,1,5,6,4,4,2};
        /*shuffle(nums);
        quickSort(nums, 0, nums.length - 1);*/
        //mergeSort(nums, 0, nums.length - 1, new int[nums.length]);
        //maxAreaOfIsland(new int[][]{{0,1,1,0,0,1,1,0},{0,1,0,0,0,1,1,0}});
        //findCircleNum(new int[][]{{1,0,0,1},{0,1,1,0},{0,1,1,1},{1,0,1,1}});
        //permute(new int[]{1,2,3});
        //combine(4, 2);
        //findLadders("aaaaa", "uuuuu", new ArrayList<>(Arrays.asList("aaaaa","waaaa","wbaaa","xaaaa","xbaaa","bbaaa","bbwaa","bbwba","bbxaa","bbxba","bbbba","wbbba","wbbbb","xbbba","xbbbb","cbbbb","cwbbb","cwcbb","cxbbb","cxcbb","cccbb","cccwb","cccwc","cccxb","cccxc","ccccc","wcccc","wdccc","xcccc","xdccc","ddccc","ddwcc","ddwdc","ddxcc","ddxdc","ddddc","wdddc","wdddd","xdddc","xdddd","edddd","ewddd","ewedd","exddd","exedd","eeedd","eeewd","eeewe","eeexd","eeexe","eeeee","weeee","wfeee","xeeee","xfeee","ffeee","ffwee","ffwfe","ffxee","ffxfe","ffffe","wfffe","wffff","xfffe","xffff","gffff","gwfff","gwgff","gxfff","gxgff","gggff","gggwf","gggwg","gggxf","gggxg","ggggg","wgggg","whggg","xgggg","xhggg","hhggg","hhwgg","hhwhg","hhxgg","hhxhg","hhhhg","whhhg","whhhh","xhhhg","xhhhh","ihhhh","iwhhh","iwihh","ixhhh","ixihh","iiihh","iiiwh","iiiwi","iiixh","iiixi","iiiii","wiiii","wjiii","xiiii","xjiii","jjiii","jjwii","jjwji","jjxii","jjxji","jjjji","wjjji","wjjjj","xjjji","xjjjj","kjjjj","kwjjj","kwkjj","kxjjj","kxkjj","kkkjj","kkkwj","kkkwk","kkkxj","kkkxk","kkkkk","wkkkk","wlkkk","xkkkk","xlkkk","llkkk","llwkk","llwlk","llxkk","llxlk","llllk","wlllk","wllll","xlllk","xllll","mllll","mwlll","mwmll","mxlll","mxmll","mmmll","mmmwl","mmmwm","mmmxl","mmmxm","mmmmm","wmmmm","wnmmm","xmmmm","xnmmm","nnmmm","nnwmm","nnwnm","nnxmm","nnxnm","nnnnm","wnnnm","wnnnn","xnnnm","xnnnn","onnnn","ownnn","owonn","oxnnn","oxonn","ooonn","ooown","ooowo","oooxn","oooxo","ooooo","woooo","wpooo","xoooo","xpooo","ppooo","ppwoo","ppwpo","ppxoo","ppxpo","ppppo","wpppo","wpppp","xpppo","xpppp","qpppp","qwppp","qwqpp","qxppp","qxqpp","qqqpp","qqqwp","qqqwq","qqqxp","qqqxq","qqqqq","wqqqq","wrqqq","xqqqq","xrqqq","rrqqq","rrwqq","rrwrq","rrxqq","rrxrq","rrrrq","wrrrq","wrrrr","xrrrq","xrrrr","srrrr","swrrr","swsrr","sxrrr","sxsrr","sssrr","ssswr","sssws","sssxr","sssxs","sssss","wssss","wtsss","xssss","xtsss","ttsss","ttwss","ttwts","ttxss","ttxts","tttts","wttts","wtttt","xttts","xtttt","utttt","uwttt","uwutt","uxttt","uxutt","uuutt","uuuwt","uuuwu","uuuxt","uuuxu","uuuuu","zzzzz","zzzzy","zzzyy","zzyyy","zzyyx","zzyxx","zzxxx","zzxxw","zzxww","zzwww","zzwwv","zzwvv","zzvvv","zzvvu","zzvuu","zzuuu","zzuut","zzutt","zzttt","zztts","zztss","zzsss","zzssr","zzsrr","zzrrr","zzrrq","zzrqq","zzqqq","zzqqp","zzqpp","zzppp","zzppo","zzpoo","zzooo","zzoon","zzonn","zznnn","zznnm","zznmm","zzmmm","zzmml","zzmll","zzlll","zzllk","zzlkk","zzkkk","zzkkj","zzkjj","zzjjj","zzjji","zzjii","zziii","zziih","zzihh","zzhhh","zzhhg","zzhgg","zzggg","zzggf","zzgff","zzfff","zzffe","zzfee","zzeee","zzeed","zzedd","zzddd","zzddc","zzdcc","zzccc","zzccz","azccz","aaccz","aaacz","aaaaz","uuuzu","uuzzu","uzzzu","zzzzu")));
        climbStairs(4);
    }

    /**
     * leetcode 70. Climbing Stairs
     * 一维动态规划
     * @param n
     * @return
     */
    public static int climbStairs(int n) {
        if(n <= 2) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3;i <= n;++i) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
        //因为 dp[i] 只与 dp[i-1] 和 dp[i-2] 有关
        //因此可以只用两个变量来存储 dp[i-1] 和 dp[i-2]，此种解法能进行空间压缩，使O(n)空间复杂度变为O(1)
        /*if(n <= 2) {
            return n;
        }
        int pre1 = 1, pre2 = 2, cur = 0;
        for(int i = 3;i <= n;++i) {
            cur = pre1 + pre2;
            pre1 = pre2;
            pre2 = cur;
        }
        return cur;*/
    }

    /**
     * leetcode126. Word Ladder II
     * 反向dfs可提高效率
     * @param beginWord
     * @param endWord
     * @param wordList
     * @return
     */
    public static List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)) {
            return result;
        }
        Queue<String> queue = new LinkedList<>();
        Set<String> nextLevel = new HashSet<>();
        queue.add(beginWord);
        int L = beginWord.length();
        for(String word : wordList) {
            for(int i = 0;i < L;++i) {
                String newWord = word.substring(0, i) + "*" + word.substring(i + 1, L);
                List<String> list = allComboDict.getOrDefault(newWord, new ArrayList<>());
                list.add(word);
                allComboDict.put(newWord, list);
            }
        }
        wordList.remove(beginWord);
        boolean find = false;
        while(!queue.isEmpty()) {
            int size = queue.size();
            while(size-- > 0) {
                String word = queue.poll();
                for(int i = 0;i < L;++i) {
                    String newWord = word.substring(0, i) + "*" + word.substring(i + 1, L);
                    for(String adjacentWord : allComboDict.getOrDefault(newWord, new ArrayList<>())) {
                        List<String> list = path.getOrDefault(adjacentWord, new LinkedList<>());
                        if(word.equals(adjacentWord)) {
                            continue;
                        }
                        if(endWord.equals(adjacentWord)) {
                            find = true;
                            list.add(word);
                            path.put(adjacentWord, list);
                        }
                        if(!find && wordList.contains(adjacentWord)) {
                            nextLevel.add(adjacentWord);
                            list.add(word);
                            path.put(adjacentWord, list);
                        }
                    }
                }

            }

            if(find) {
                break;
            }
            queue.addAll(nextLevel);
            wordList.removeAll(nextLevel);
            nextLevel.clear();

        }
        List<String> solution = new LinkedList();
        solution.add(endWord);
        reverseDfs(endWord, beginWord, solution);
        return result;
    }

    public static void reverseDfs(String src, String des, List<String> list) {
        if(src.equals(des)) {
            List<String> tempList = new LinkedList(list);
            Collections.reverse(tempList);
            result.add(tempList);
            return;
        }
        for(String adjacentWord : path.getOrDefault(src, new LinkedList<String>())) {
            list.add(adjacentWord);
            reverseDfs(adjacentWord, des, list);
            list.remove(list.size() - 1);
        }
    }

    static Map<String, List<String>> allComboDict = new HashMap();
    static Map<String, List<String>> path = new HashMap();
    static List<List<String>> result = new LinkedList();

    /**
     * leetcode126. Word Ladder II
     * 此种解法由于正向dfs会导致耗时较久，leetcode无法AC
     * 双端BFS比单向bfs效率高，但此题需要反向构建图及反向dfs故无法使用双端bfs
     * @param beginWord
     * @param endWord
     * @param wordList
     * @return
     */
    /*public static List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)) {
            return result;
        }
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        set1.add(beginWord);
        set2.add(endWord);
        int L = beginWord.length();
        for(String word : wordList) {
            for(int i = 0;i < L;++i) {
                String newWord = word.substring(0, i) + "*" + word.substring(i + 1, L);
                List<String> list = allComboDict.getOrDefault(newWord, new ArrayList<>());
                list.add(word);
                allComboDict.put(newWord, list);
            }
        }
        wordList.remove(beginWord);
        wordList.remove(endWord);
        boolean find = false;
        boolean reverseFlag = false;
        //双端bfs寻找最短路径
        while(!set1.isEmpty()) {
            Set<String> set = new HashSet<>();
            for(String word : set1) {
                for(int i = 0;i < L;++i) {
                    String newWord = word.substring(0, i) + "*" + word.substring(i + 1, L);
                    for(String adjacentWord : allComboDict.getOrDefault(newWord, new ArrayList<>())) {
                        String key = reverseFlag ? adjacentWord : word;
                        String value = reverseFlag ? word : adjacentWord;
                        List<String> list = path.getOrDefault(key, new LinkedList<>());
                        if(set2.contains(adjacentWord)) {
                            find = true;
                            list.add(value);
                            path.put(key, list);
                        }
                        if(wordList.contains(adjacentWord)) {
                            set.add(adjacentWord);
                            list.add(value);
                            path.put(key, list);
                        }
                    }
                }

            }

            if(find) {
                break;
            }
            wordList.removeAll(set);
            if(set.size() <= set2.size()) {
                set1 = set;
            } else {
                set1 = set2;
                set2 = set;
                reverseFlag = !reverseFlag;
            }

        }
        List<String> solution = new LinkedList();
        solution.add(beginWord);
        //dfs回溯所有的结果
        dfs(beginWord, endWord, solution);
        return result;
    }

    public static void dfs(String beginWord, String endWord, List<String> list) {
        if(endWord.equals(beginWord)) {
            result.add(new LinkedList(list));
            return;
        }
        for(String adjacentWord : path.getOrDefault(beginWord, new LinkedList<String>())) {
            list.add(adjacentWord);
            dfs(adjacentWord, endWord, list);
            list.remove(list.size() - 1);
        }
    }*/


    /**
     * 回溯法实现组合
     * leetcode77. Combinations
     * 从1到n中选k个数组合
     * @param n
     * @param k
     * @return
     */
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new LinkedList();
        backtrack(result, new LinkedList<Integer>(), 1, n, k);
        return result;
    }

    public static void backtrack(List<List<Integer>> result, List<Integer> tempList, int level, int n, int k) {
        if(tempList.size() == k) {
            result.add(new LinkedList(tempList));
            return;
        }
        for(int i = level;i <= n;i++){
            tempList.add(i);
            backtrack(result, tempList, i + 1, n, k);
            tempList.remove(tempList.size() - 1);
        }
    }

    /**
     * 回溯法实现全排列
     * leetcode46. Permutations
     * @param nums
     * @return
     */
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtracking(nums, 0, result);
        return result;
    }

    public static void backtracking(int[] nums, int level, List<List<Integer>> result) {
        if(level == nums.length - 1) {
            result.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
            return;
        }
        for(int i = level;i < nums.length;i++) {
            swap(nums, i, level);
            backtracking(nums, level + 1, result);
            swap(nums, i, level);
        }
    }

    /**
     * leetcode547. Number of Provinces
     * 深度优先搜索递归实现
     * @param isConnected
     * @return
     */
    public static int findCircleNum(int[][] isConnected) {
        int num = 0;
        boolean[] visited = new boolean[isConnected.length];
        for(int i = 0;i < isConnected[0].length;i++) {
            if(!visited[i]) {
                dfs(isConnected, i, visited);
                ++num;
            }
        }
        return num;
    }

    public static void dfs(int[][] isConnected, int i, boolean[] visited) {
        visited[i] = true;
        for(int j = 0;j < isConnected[0].length;j++) {
            if(!visited[j] && isConnected[i][j] == 1) {
                dfs(isConnected, j, visited);
            }
        }
    }

    /**
     * leetcode695. Max Area of Island
     * 深度优先搜素栈实现
     * @param grid
     * @return
     */
    public static int maxAreaOfIsland(int[][] grid) {
        int area, maxArea = 0;
        int x, y;
        int[] direction = new int[]{-1, 0, 1, 0, -1};
        for(int i = 0;i < grid.length;i++) {
            for(int j = 0;j < grid[i].length;j++) {
                if(grid[i][j] == 1) {
                    grid[i][j] = 0;
                    area = 1;
                    Stack<int[]> stack = new Stack<>();
                    stack.push(new int[]{i, j});
                    while(!stack.isEmpty()) {
                        int[] index = stack.pop();
                        for(int k = 0;k < 4;k++) {
                            x = index[0] + direction[k];
                            y = index[1] + direction[k + 1];
                            if(x >= 0 && x < grid.length && y >= 0 && y < grid[i].length && grid[x][y] == 1) {
                                stack.push(new int[]{x, y});
                                grid[x][y] = 0;
                                ++area;
                            }
                        }
                    }
                    maxArea = Math.max(area, maxArea);
                }
            }
        }
        return maxArea;
    }

    /**
     * 归并排序
     * @param nums 传入的数组
     * @param l 当前子数组的起始下标
     * @param r 当前子数组的结束下标
     * @param temp 拷贝暂存数组
     */
    public static void mergeSort(int[] nums, int l, int r, int[] temp) {
        if(l >= r) {
            return;
        }
        int mid = l + (r - l) / 2;
        mergeSort(nums, l, mid, temp);
        mergeSort(nums, mid + 1, r, temp);
        int p = l, q = mid + 1, i = l;
        while(p <= mid || q <= r) {
            if(q > r || (p <= mid && nums[p] <= nums[q])) {
                temp[i++] = nums[p++];
            } else {
                temp[i++] = nums[q++];
            }
        }
        for(i = l;i <= r;i++) {
            nums[i] = temp[i];
        }
    }

    /**
     * 快速排序
     * @param nums
     * @param begin
     * @param end
     */
    public static void quickSort(int[] nums, int begin, int end){
        if(begin > end) {
            return;
        }
        int i = begin, j = end, pivot = nums[begin];
        while(i < j) {
            //此处必须先执行完所有的--j再执行++i
            while(nums[j] >= pivot && i < j) {
                --j;
            }
            while(nums[i] <= pivot && i < j) {
                ++i;
            }
            if(i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        nums[begin] = nums[i];
        nums[i] = pivot;
        quickSort(nums, begin, i - 1);
        quickSort(nums, i + 1, end);
    }

    /**
     * 打乱待排序数组顺序，防止快速排序本来有序的情况下时间复杂度到达最差的O(n^2)
     * @param nums
     */
    public static void shuffle(int[] nums) {
        final Random random = new Random();
        for(int i = 0;i < nums.length;i++) {
            int r = random.nextInt(i + 1);
            swap(nums, i, r);
        }
    }

    /**
     * 快速选择，找到数组中第k大的数
     * @param nums
     * @param k
     * @return
     */
    public static int findKthLargest(int[] nums, int k) {
        int l = 0, r = nums.length - 1, target = nums.length - k;
        while(l < r) {
            int mid = quickSelection(nums, l, r);
            if(mid == target) {
                return nums[mid];
            }
            if(mid < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return nums[l];
    }

    /**
     * 辅函数 - 快速选择
     * @param nums
     * @param l
     * @param r
     * @return
     */
    public static int quickSelection(int[] nums, int l, int r) {
        int i = l + 1, j = r;
        while(true) {
            while(i < r && nums[i] <= nums[l]) {
                ++i;
            }
            while(l < j && nums[j] >= nums[l]) {
                --j;
            }
            if(i >= j) {
                break;
            }
            swap(nums, i, j);
        }
        swap(nums, l, j);
        return j;
    }

    public static int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length - 1, mid = 0;
        while(low < high) {
            mid = low + (high - low) / 2;
            if((mid % 2 == 0 && nums[mid] == nums[mid + 1])
                    || (mid % 2 != 0 && nums[mid] == nums[mid - 1])) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }

    public static boolean binarySearch(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while(l <= r) {
            int mid = l + (r - l) / 2;
            if(target == nums[mid]) {
                return true;
            }
            if(nums[mid] == nums[l]) {
                ++l;
            } else if(nums[mid] <= nums[r]) {
                //右区间递增
                if(target > nums[mid] && target <= nums[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            } else {
                //左区间递增
                if(target < nums[mid] && target >= nums[l]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }

        }
        return false;
    }

    public static int mySqrt(int x) {
        if(x == 0) return 0;
        int l = 1;
        int r = x;
        int mid, sqrt;
        while(l <= r) {
            mid = l + (r - l) / 2;
            sqrt = x / mid;
            if(sqrt == mid) return mid;
            else if(sqrt < mid) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }

    public static int trap(int[] height) {
        if(height == null || height.length < 2) return 0;
        int h = 0;
        int left = -1;
        for(int i = 1;i < height.length;i++) {
            if(left == -1) {
                if(height[i] < height[i - 1]) {
                    left = i - 1;
                }
            } else {
                if(height[i] >= height[left] && i > left + 1) {
                    h += calculateHeight(height, left, i);
                    left = -1;
                }
                if(i == height.length - 1 && left != -1) {
                    h += calculateHeight(height, left, i);
                }
            }

        }
        return h;

    }

    public static int calculateHeight(int[] height, int left, int right) {
        int h = 0;
        if(height[right] >= height[left]) {
            for(int i = left + 1;i < right;i++) {
                h += (height[left] - height[i]);
            }
        } else {
            int middle = findMiddle(height, left, right);
            for(int i = left + 1;i < middle;i++) {
                if(height[middle] > height[i]) {
                    h += (height[middle] - height[i]);
                }
            }
            return h += calculateHeight(height, middle, right);
        }
        return h;
    }

    public static int findMiddle(int[] height, int left, int right) {
        int middle = left + 1;
        for(int i = left + 1;i <= right;i++) {
            if(height[i] > height[middle]) {
                middle = i;
            }
        }
        return middle;
    }

    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            if(nums[i] > 0 && nums[i] <= nums.length && nums[nums[i] - 1] != nums[i]) {
                swap(nums, nums[i] - 1, i);
            } else {
                i++;
            }
        }
        i = 0;
        while(i < nums.length && nums[i] == i + 1) {
            i++;
        }
        return i + 1;
    }

    public static void swap(int[] nums, int i, int j) {
        int k = nums[i];
        nums[i] = nums[j];
        nums[j] = k;
    }

    public static boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static boolean isValidBST(TreeNode root, long minVal, long maxVal) {
        if (root == null) return true;
        if (root.val >= maxVal || root.val <= minVal) return false;
        return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
    }

    /*public static boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    public static boolean helper(TreeNode node, Integer lowwer, Integer upper) {
        if(node == null)  return true;
        int val = node.val;
        if(lowwer != null && val < lowwer) return false;
        if(upper != null && val > upper) return false;
        if(!helper(node.left, lowwer, val)) return false;
        if(!helper(node.right, val, upper)) return false;
        return true;

    }*/

    /*public static List < Integer > inorderTraversal(TreeNode root) {
        List < Integer > res = new ArrayList < > ();
        TreeNode curr = root;
        TreeNode pre;
        while (curr != null) {
            if (curr.left == null) {
                res.add(curr.val);
                curr = curr.right; // move to next right node
            } else { // has a left subtree
                pre = curr.left;
                while (pre.right != null) { // find rightmost
                    pre = pre.right;
                }
                pre.right = curr; // put cur after the pre node
                TreeNode temp = curr; // store cur node
                curr = curr.left; // move cur to the top of the new tree
                temp.left = null; // original cur left be null, avoid infinite loops
            }
        }
        return res;
    }*/

    public static List inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        TreeNode node = root;
        TreeNode pre;   //前序节点
        while(node != null) {
            if(node.left == null) {
                list.add(node.val);
                node = node.right;
            } else {
                pre = node.left;
                while(pre.right != null && pre.right != node) {
                    pre = pre.right;
                }
                if(pre.right == null) {
                    pre.right = node;
                    node = node.left;
                } else if(pre.right == node) {
                    pre.right = null;
                    list.add(node.val);
                    node = node.right;
                }
            }
        }
        return list;
    }


    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList();
        Stack<TreeNode> stack = new Stack();
        TreeNode curr = null;
        stack.push(root);
        while(!stack.isEmpty()) {
            curr = stack.pop();
            if(curr != null) {
                list.add(0, curr.val);
                stack.push(curr.left);
                stack.push(curr.right);
            }
        }
        return list;

    }


    /*Regular Expression Matching*/
    /*public static boolean isMatch(String text, String pattern) {
        if (pattern.isEmpty()) return text.isEmpty();
        boolean first_match = (!text.isEmpty() &&
                (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));

        if (pattern.length() >= 2 && pattern.charAt(1) == '*'){
            return (isMatch(text, pattern.substring(2)) ||
                    (first_match && isMatch(text.substring(1), pattern)));
        } else {
            return first_match && isMatch(text.substring(1), pattern.substring(1));
        }
    }*/

    /*Regular Expression Matching*/
    /*public static boolean isMatch(String s, String p) {
        if(s == null || p == null) {
            return false;
        }
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[s.length()][p.length()] = true;
        for(int i = p.length() - 1;i >= 0;i--) {
           if(p.charAt(i) == '*') {
               dp[s.length()][i] = true;
           } else {
               break;
           }
        }
        for(int i = s.length() - 1;i >= 0;i--) {
            for(int j = p.length() - 1;j >= 0;j--) {
                if(p.charAt(j) == s.charAt(i) || p.charAt(j) == '?') {
                    dp[i][j] = dp[i + 1][j + 1];
                }
                if(p.charAt(j) == '*') {
                    dp[i][j] = dp[i][j + 1] || dp[i + 1][j];
                }
            }
        }
        return dp[0][0];
    }*/

    /*recursion leetcode提交会超时*/
    /*public static boolean isMatch(String text, String pattern) {
        if (pattern.isEmpty()) return text.isEmpty();
        if (pattern.length() == 1 && pattern.charAt(0) == '*') {
            return true;
        }
        if (text.isEmpty() && pattern.charAt(0) == '*') {
           for(int i = 0;i < pattern.length();i++) {
               if(pattern.charAt(i) != '*') {
                   return false;
               }
           }
           return true;
        }
        boolean first_match = (!text.isEmpty() &&
                (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '?' || pattern.charAt(0) == '*'));
        if (text.length() >= 1 && pattern.length() >= 1 && pattern.charAt(0) == '*'){
            return isMatch(text, pattern.substring(1)) || isMatch(text.substring(1), pattern);
        } else {
            return first_match && isMatch(text.substring(1), pattern.substring(1));
        }
    }*/

    /*recursion*/
    public static boolean isMatch(String s, String p) {
        return helper(s.toCharArray(), p.toCharArray(), 0, 0, 0, -1);
    }

    private static boolean helper(char[] s, char[] p, int i, int j, int lastS, int lastP) {
        if(i == s.length && j == p.length) return true;
        if(j < p.length) {
            if(i == s.length)
                return p[j] == '*' ? helper(s, p, i, j + 1, lastS, lastP) : false;
            if(p[j] == '?' || s[i] == p[j])
                return helper(s, p, i + 1, j + 1, lastS, lastP);
            if(p[j] == '*')
                return helper(s, p, i, j + 1, i, j);
        }
        if(lastP != -1) return helper(s, p, lastS + 1, lastP, lastS + 1, lastP);
        return false;
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int total = 0;
        char[] chs = s.toCharArray();
        for(int i = 0;i < chs.length;i++) {
            if(i != chs.length - 1) {
                if(map.get(chs[i]) >= map.get(chs[i + 1])) {
                    total += map.get(chs[i]);
                } else {
                    total -= map.get(chs[i]);
                }
            } else {
                total += map.get(chs[i]);
            }

        }
        return total;
    }

    public static int singleRomanToInt(char c) {
        switch (c) {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
    }

    public static int search(int[] nums, int target) {
        if(nums.length == 0) return -1;
        int min = 0;
        int max = nums.length - 1;
        int mid = 0;
        while(min <= max) {
            mid = (min + max) / 2;
            if(nums[min] < nums[max]) {
                if(target == nums[mid]) {
                    return mid;
                } else if(target < nums[mid]) {
                    max = mid - 1;
                } else {
                    min = mid + 1;
                }
            } else {
                if(target == nums[mid]) {
                    return mid;
                } else if(target < nums[mid]) {
                    if(target < nums[max]) {
                        if(nums[mid] > nums[min]) {
                            min = mid + 1;
                        } else {
                            max = mid - 1;
                        }
                    } else if(target > nums[max]) {
                        max = mid - 1;
                    } else {
                        return max;
                    }
                } else {
                    if(target < nums[max]) {
                        min = mid + 1;
                    } else if(target > nums[max]) {
                        if(nums[mid] > nums[min]) {
                            min = mid + 1;
                        } else {
                            max = mid - 1;
                        }
                    } else {
                        return max;
                    }
                }
            }

        }
        return -1;

    }

    public int[] searchRange(int[] A, int target) {
        int start = firstGreaterEqual(A, target);
        if (start == A.length || A[start] != target) {
            return new int[]{-1, -1};
        }
        return new int[]{start, firstGreaterEqual(A, target + 1) - 1};
    }

    //find the first number that is greater than or equal to target.
    //could return A.length if target is greater than A[A.length-1].
    //actually this is the same as lower_bound in C++ STL.
    private static int firstGreaterEqual(int[] A, int target) {
        int low = 0, high = A.length;
        while (low < high) {
            int mid = low + ((high - low) >> 1);
            //low <= mid < high
            if (A[mid] < target) {
                low = mid + 1;
            } else {
                //should not be mid-1 when A[mid]==target.
                //could be mid even if A[mid]>target because mid<high.
                high = mid;
            }
        }
        return low;
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSum(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSum2(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    /**
     * 每个元素可使用多次，数组中无重复元素
     * eg:7,3,6,2
     * @param list
     * @param tempList
     * @param nums
     * @param remain
     * @param start
     */
    public static void combinationSum(List<List<Integer>> list, List<Integer> tempList, int[] nums, int remain, int start) {
        if(remain < 0){
            return;
        } else if(remain == 0){
            list.add(new ArrayList<>(tempList));
        } else {
            for(int i = start;i < nums.length;i++) {
                tempList.add(nums[i]);
                combinationSum(list, tempList, nums, remain - nums[i], i);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    /**
     * 每个元素只能使用一次，数组中有重复元素
     * eg:10,1,2,7,6,1,5
     * @param list
     * @param tempList
     * @param nums
     * @param remain
     * @param start
     */
    public static void combinationSum2(List<List<Integer>> list, List<Integer> tempList, int[] nums, int remain, int start) {
        if(remain < 0){
            return;
        } else if(remain == 0){
            list.add(new ArrayList<>(tempList));
        } else {
            for(int i = start;i < nums.length;i++) {
                if(i > start && nums[i] == nums[i - 1]) {
                    continue;
                }
                tempList.add(nums[i]);
                combinationSum2(list, tempList, nums, remain - nums[i], i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    /**
     * 全排列
     * @param candidates
     * @return
     */
    public static List<List<Integer>> fullArrangement(int[] candidates) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[candidates.length];
        fullArrangement(result, new ArrayList<>(), candidates, used);
        return result;
    }


    public static void fullArrangement(List<List<Integer>> list, List<Integer> tempList, int[] nums, boolean[] used) {
        if(tempList.size() == nums.length){
            list.add(new ArrayList<>(tempList));
        } else {
            for(int i = 0;i < nums.length;i++) {
                if(!used[i]) {
                    used[i] = true;
                    tempList.add(nums[i]);
                    fullArrangement(list, tempList, nums, used);
                    tempList.remove(tempList.size() - 1);
                    used[i] = false;
                }
            }
        }
    }


}
