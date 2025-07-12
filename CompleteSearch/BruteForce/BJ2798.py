import sys

total, target = list(map(int, sys.stdin.readline().rstrip().split(' ')))
numLists = list(map(int, sys.stdin.readline().rstrip().split(' ')))


numLists.sort()

first, second, third = total - 3, total - 2, total - 1
best = numLists[first] + numLists[second] + numLists[third]


while True:
    to_be = numLists[first] + numLists[second] + numLists[third]

    if abs(target - best) > abs(target - to_be) and to_be < target:
        best = to_be

    if to_be == target:
        best = to_be
        break

    if first != 0:
        first -= 1
    else:
        if second == 1:
            if third == 2:
                if best > target:
                    best = to_be
                break
            else:
                third -= 1
                second  = third - 1
                first = second - 1
        else:
            second -= 1
            first = second - 1



print(best)


# 2024.02.06 Brute Force 다시 풀기
# Scanner sc = new Scanner(System.in);
#         String[] given = sc.nextLine().split(" ");
#         String[] nums = sc.nextLine().split(" ");
#
#         int cnt = Integer.parseInt(given[0]);
#         int limit = Integer.parseInt(given[1]);
#
#         Arrays.sort(given, Collections.reverseOrder());
#
#         int answer = 0;
#
#         for (int i = cnt - 1; i >= 2; i--) {
#             for (int k = i - 1; k >= 1; k--) {
#                 int currentSum = Integer.parseInt(nums[i]) + Integer.parseInt(nums[k]);
#                 for (int j = i - 2; j >= 0; j--) {
#                     int toAdd = Integer.parseInt(nums[j]);
#                     if (currentSum + toAdd <= limit) {
#                         if (currentSum + toAdd > answer) {
#                             answer = currentSum + toAdd;
#                         }
#                     }
#                 }
#             }
#         }
#         System.out.println(answer);
#         sc.close();